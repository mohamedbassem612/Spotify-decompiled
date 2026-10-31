package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bqd extends ymd0 {
    public static final Uri O0 = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    public final jlb N0 = new jlb(this, (byte) 7);
    public final Context Y;
    public final aqd Z;

    public bqd(Context context) {
        this.Y = context;
        this.Z = new aqd(this, context.getContentResolver());
    }

    @Override // p.ymd0
    public final void h() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.N0;
        Context context = this.Y;
        if (i >= 33) {
            no80.E(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
        this.Z.startQuery(42, null, O0, new String[]{"CarConnectionState"}, null, null, null);
    }

    @Override // p.ymd0
    public final void i() {
        this.Y.unregisterReceiver(this.N0);
        this.Z.cancelOperation(42);
    }
}
