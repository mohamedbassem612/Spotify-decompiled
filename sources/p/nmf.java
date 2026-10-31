package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nmf implements h0r0 {
    public final ynb0 a;
    public final hvj b;
    public final pmf c;
    public final i5p d;
    public final cbr0 e;

    public nmf(ynb0 ynb0Var, hvj hvjVar, pmf pmfVar, i5p i5pVar) {
        this.a = ynb0Var;
        this.b = hvjVar;
        this.c = pmfVar;
        this.d = i5pVar;
        String str = pmfVar.b;
        dbr0 yxe1Var = new yxe1(new jx21(2131953724));
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, j0c0Var, new bn70(yon1.B0(), new lik1(str), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return hvj.b(this.b, new o6e0(new dt0(this, null, (byte) 27), f46.I(new p6e0[0])), new j2i(-898335646, new dwd(this, (byte) 20), true));
    }
}
