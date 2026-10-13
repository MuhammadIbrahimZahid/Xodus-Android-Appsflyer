package com.andrzejn.xodus;

import android.os.Bundle;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import java.util.HashMap;
import java.util.Map;

public class AndroidLauncher extends AndroidApplication {

	private static final String AF_DEV_KEY =
			"";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Enable verbose SDK logs for testing only.
		AppsFlyerLib.getInstance().setDebugLog(true);

		// Initialize the AppsFlyer SDK.
		AppsFlyerLib.getInstance().init(
				AF_DEV_KEY,
				null,
				getApplicationContext()
		);

		// Provide the original launcher activity before starting the SDK.
		AppsFlyerLib.getInstance()
				.collectDataFromLauncherActivity(this);

		// SDK 7: wait until the SDK is ready before starting it.
		AppsFlyerLib.getInstance()
				.registerSessionReadyListener(() -> {
					AppsFlyerLib.getInstance().start();

					Map<String, Object> values = new HashMap<>();
					values.put("source", "android_launcher");
					values.put("game", "xodus");

					// Temporary custom event to verify integration.
					AppsFlyerLib.getInstance().logEvent(
							getApplicationContext(),
							"xodus_test_open",
							values
					);

					Log.d("AppsFlyer", "Startup and test event triggered");
				});

		AndroidApplicationConfiguration config =
				new AndroidApplicationConfiguration();

		initialize(new Main(), config);
	}
}