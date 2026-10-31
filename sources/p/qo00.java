package p;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qo00 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qo00(Context context, boolean z, yo00 yo00Var, dbu0 dbu0Var) {
        this.c = context;
        this.b = z;
        this.d = yo00Var;
        this.e = dbu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                yo00 yo00Var = (yo00) this.d;
                dbu0 dbu0Var = (dbu0) this.e;
                uqh0 uqh0VarJ = uqh0.j(context);
                if (uqh0VarJ == null) {
                    oon1.H("MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    yo00Var.z0(uqh0VarJ);
                }
                LogSessionId logSessionIdL = uqh0VarJ.l();
                synchronized (dbu0Var) {
                    rcl rclVar = dbu0Var.b;
                    rclVar.getClass();
                    rclVar.i(logSessionIdL);
                }
                return;
            default:
                bh61 bh61Var = (bh61) this.c;
                rin rinVar = (rin) this.d;
                String str = (String) this.e;
                boolean z2 = this.b;
                Log.isLoggable("FirebaseCrashlytics", 3);
                bh61Var.b.c(rinVar, str, z2);
                return;
        }
    }

    public /* synthetic */ qo00(bh61 bh61Var, rin rinVar, String str, boolean z) {
        this.c = bh61Var;
        this.d = rinVar;
        this.e = str;
        this.b = z;
    }
}
