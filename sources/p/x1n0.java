package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x1n0 implements zn41 {
    public final String a;
    public final oo70 b;
    public final ao41 c;

    public x1n0(String str, oo70 oo70Var, ao41 ao41Var) {
        this.a = str;
        this.b = oo70Var;
        this.c = ao41Var;
    }

    public final void a(String str, iu30 iu30Var) {
        this.b.a(nzm0.a);
        Logger.b(cy30.p("[Quasar][", this.a, "] Submitting action \"", str, "\" to be executed on Worker thread"), new Object[0]);
        this.c.a(str, iu30Var);
    }

    public final void b(String str, long j, gyq0 gyq0Var, ozp0 ozp0Var) {
        this.b.a(nzm0.a);
        Logger.b(cy30.p("[Quasar][", this.a, "] Submitting action \"", str, "\" to be executed on Worker thread"), new Object[0]);
        this.c.b(str, j, gyq0Var, ozp0Var);
    }

    public final void c(String str, iu30 iu30Var) {
        this.b.a(nzm0.a);
        Logger.b(cy30.p("[Quasar][", this.a, "] Submitting action \"", str, "\" to be executed on Main thread"), new Object[0]);
        this.c.c(str, iu30Var);
    }
}
