package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vyf implements h0r0 {
    public final wev a;
    public final a6p b;
    public final cbr0 c;

    public vyf(wev wevVar, a6p a6pVar, ynb0 ynb0Var, m021 m021Var) {
        this.a = wevVar;
        this.b = a6pVar;
        dbr0 yxe1Var = new yxe1(new jx21(2131953825));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.g4(), nik1.k2, (nar0) null), new wyf(new tyf(ynb0Var)), new yyf(new uyf(m021Var)), new t1r0(true), new s9h1(14, true, false, false), new pu00(true), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new syf(this, (byte) 0));
    }
}
