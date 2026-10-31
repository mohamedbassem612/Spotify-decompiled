package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ufo implements h0r0 {
    public final a8e0 a;
    public final asn b;
    public final wfo c;
    public final lo8 d;
    public final cbr0 e;

    public ufo(a8e0 a8e0Var, asn asnVar, wfo wfoVar, lo8 lo8Var) {
        this.a = a8e0Var;
        this.b = asnVar;
        this.c = wfoVar;
        this.d = lo8Var;
        dbr0 yxe1Var = new yxe1(new ehc1("Cultural moment"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.n1(), nik1.b0.b(wfoVar.getUri()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(bbp1.g(this.b.h(this.c.a())), new fnn(this, (byte) 19), new u7r0(a4p1.n(), (g4h1) null, (iu30) null, false, false, 126));
    }
}
