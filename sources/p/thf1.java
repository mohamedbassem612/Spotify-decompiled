package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class thf1 extends BroadcastReceiver {
    public uhf1 a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        uhf1 uhf1Var = this.a;
        if (uhf1Var == null) {
            return;
        }
        if (uhf1Var.c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            uhf1 uhf1Var2 = this.a;
            uhf1Var2.d.f.schedule(uhf1Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
