package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ll9 implements h0r0 {
    public final qyj a;
    public final rm9 b;
    public final nl9 c;
    public final a1r0 d;
    public final mko e;
    public final cbr0 f;

    public ll9(qyj qyjVar, rm9 rm9Var, nl9 nl9Var, a1r0 a1r0Var, mko mkoVar) {
        this.a = qyjVar;
        this.b = rm9Var;
        this.c = nl9Var;
        this.d = a1r0Var;
        this.e = mkoVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.G1("BYOM_NOWPLAYING_CHAPTERS", "byom/nowplaying/chapters", 262, "byom"), new lik1("spotify:internal:byom-chapters"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1599956039, new mu6(this, (byte) 20), true));
    }
}
