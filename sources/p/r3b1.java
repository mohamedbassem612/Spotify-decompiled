package p;

import android.content.Context;
import android.net.ConnectivityManager;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r3b1 {
    public final ConnectivityManager a;
    public final zd1 b;
    public final idd1 c;

    public r3b1(Context context, rcl rclVar, Scheduler scheduler) {
        this.a = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        this.b = new zd1(context, rclVar);
        this.c = new idd1(new k7a1(this, scheduler, (byte) 8));
    }

    public final gbl a() {
        gbl gblVarA = this.b.a();
        return gblVarA == gbl.f ? (gbl) ((Observable) this.c.getValue()).blockingFirst() : gblVarA;
    }
}
