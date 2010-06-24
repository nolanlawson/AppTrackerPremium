package com.nolanlawson.apptracker.license;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		FreemiumHelper.setAppTrackerPremiumIcon(arg0, !FreemiumHelper.isAppTrackerFreeInstalled(arg0));
	}
}
