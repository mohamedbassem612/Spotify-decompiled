package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fni1 implements h0r0 {
    public final kyj a;
    public final ani1 b;
    public final hni1 c;
    public final kly0 d;
    public final nac0 e;
    public final pni1 f;
    public final idd1 g = new idd1(new dch1(this, 14));
    public final cbr0 h;

    public fni1(kyj kyjVar, ani1 ani1Var, hni1 hni1Var, los losVar, jly0 jly0Var, nac0 nac0Var, pni1 pni1Var) {
        this.a = kyjVar;
        this.b = ani1Var;
        this.c = hni1Var;
        this.d = jly0Var;
        this.e = nac0Var;
        this.f = pni1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{new bn70(yon1.G1("USERS_NEARBY", "users_nearby", 2074, "users_nearby"), new lik1("spotify:internal:users-nearby"), (nar0) null), new nxb(null, ixb.b, null, 0, null, losVar, false, false, false, null, 4061), new t1r0(true), new tc30(1)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(674346425, new zyf1(this, (byte) 11), true), new dx81(new eni1(this), new ymg1(this, (byte) 23), f2x0.V0, (iu30) null));
    }

    public final ymi1 c() {
        return (ymi1) this.g.getValue();
    }
}
