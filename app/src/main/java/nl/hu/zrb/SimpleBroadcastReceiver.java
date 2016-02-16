package nl.hu.zrb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SimpleBroadcastReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context rcvContext, Intent rcvIntent) {
		String action = rcvIntent.getAction();
		if (action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
			rcvContext.startService(new Intent(rcvContext,
					SimpleService.class));
		}
		if (action.equals(Intent.ACTION_DATE_CHANGED)) {
			rcvContext.startService(new Intent(rcvContext,
					SimpleService.class));
		}
	}
}

