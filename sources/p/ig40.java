package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ig40 implements h0r0 {
    public final qyj a;
    public final og40 b;
    public final los c;
    public final dh30 d;
    public final ro30 e;
    public final cbr0 f;

    public ig40(qyj qyjVar, og40 og40Var, los losVar, dh30 dh30Var, ro30 ro30Var) {
        this.a = qyjVar;
        this.b = og40Var;
        this.c = losVar;
        this.d = dh30Var;
        this.e = ro30Var;
        dbr0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.G1("MAGPIE_GENERATION_MODE", "magpie/generation-mode", 981, "magpie"), nik1.h6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 2, (mxb) null, losVar, false, false, false, (nsm0) null, 4053), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1762023540, new rr10(this, (byte) 26), true));
    }
}
