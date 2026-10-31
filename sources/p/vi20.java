package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vi20 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public vi20(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        AtomicReference atomicReference = b;
        if (atomicReference.get() == null) {
            vi20 vi20Var = new vi20(context);
            while (!atomicReference.compareAndSet(null, vi20Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(vi20Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (wi20.k) {
            try {
                Iterator it = wi20.l.values().iterator();
                while (it.hasNext()) {
                    ((wi20) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
