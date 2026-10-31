package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l1m implements h0r0 {
    public final n1m a;
    public final qyj b;
    public final w6q c;
    public final yqg d;
    public final cbr0 e;

    public l1m(n1m n1mVar, qyj qyjVar, w6q w6qVar, yqg yqgVar) {
        this.a = n1mVar;
        this.b = qyjVar;
        this.c = w6qVar;
        this.d = yqgVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.y0(), new lik1(n1mVar.a()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.b.a(apo.j(559473322, new h1m(this, (byte) 1), true));
    }
}
