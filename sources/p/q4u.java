package p;

import defpackage.d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q4u {
    public final iu30 a;
    public boolean b;

    public q4u(iu30 iu30Var, vu30 vu30Var) {
        this.a = new o4u(new AtomicReference(), this, vu30Var, iu30Var, (byte) 0);
    }

    public final synchronized void a(Object obj) {
        this.a.invoke(obj);
    }

    public q4u(d dVar) {
        this.a = dVar;
    }
}
