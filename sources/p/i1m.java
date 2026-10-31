package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i1m implements h0r0 {
    public final qyj a;
    public final k8p b;
    public final cbr0 c;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public i1m(k1m k1mVar, qyj qyjVar, k8p k8pVar) {
        this.a = qyjVar;
        this.b = k8pVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.v0(), new lik1(k1mVar.a()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(1506386607, new h1m(this, (byte) 0), true));
    }
}
