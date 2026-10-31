package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mo70 extends BroadcastReceiver {
    public static final List b;
    public static final IntentFilter c;
    public final hs20 a;

    static {
        List listM = p7h.M(new String[]{"android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED"});
        b = listM;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        c = intentFilter;
    }

    public mo70(hs20 hs20Var) {
        this.a = hs20Var;
    }

    public final void a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean zA = oh5.a.a(powerManager);
        if (Build.VERSION.SDK_INT >= 33) {
            zA = zA || xh5.a.a(powerManager);
        }
        if (zA) {
            this.a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (o7h.i0(b, intent.getAction())) {
            a(context);
        }
    }
}
