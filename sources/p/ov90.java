package p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ov90 {
    public final pv90 a;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final j0d1 c;
    public final dt71 d;
    public final x880 e;

    public ov90(pv90 pv90Var, faa0 faa0Var) {
        this.a = pv90Var;
        this.c = new j0d1(faa0Var);
        dt71 dt71VarE = mgo1.e(0, 64, 0, 5);
        this.d = dt71VarE;
        this.e = new x880(dt71VarE, this, (byte) 6);
    }

    public final synchronized void a() {
        this.b.set(false);
        this.c.d((CancellationException) null);
    }
}
