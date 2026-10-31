package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4z0 {
    public final fcz0 a;
    public final g5p0 b;
    public final kge c;
    public final u9c0 d;
    public final au90 e;
    public final fh4 f;
    public xab1 g;

    public s4z0(fcz0 fcz0Var, g5p0 g5p0Var, kge kgeVar, u9c0 u9c0Var, au90 au90Var, fh4 fh4Var) {
        this.a = fcz0Var;
        this.b = g5p0Var;
        this.c = kgeVar;
        this.d = u9c0Var;
        this.e = au90Var;
        this.f = fh4Var;
    }

    public final void a(ou80 ou80Var, boolean z) {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = fn31.T(this.d, (o8n) null, 0, new hl0(this, ou80Var, z, (lnm) null, (byte) 18), 3);
    }
}
