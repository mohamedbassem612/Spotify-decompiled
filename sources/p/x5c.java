package p;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x5c extends MainThreadDisposable {
    public final Observer b;
    public final Context c;
    public final jlb d;

    public x5c(Observer observer, Context context, IntentFilter intentFilter, Handler handler) {
        this.b = observer;
        this.c = context;
        jlb jlbVar = new jlb(this, (byte) 6);
        this.d = jlbVar;
        if (Build.VERSION.SDK_INT <= 33) {
            context.registerReceiver(jlbVar, intentFilter, null, handler);
        } else {
            context.registerReceiver(jlbVar, intentFilter, null, handler);
        }
    }

    public final void a() {
        this.c.unregisterReceiver(this.d);
    }
}
