package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ttf implements h0r0 {
    public final kyj a;
    public final k9m0 b;
    public final kly0 c;
    public final nac0 d;
    public final vtf e;
    public final idd1 f = new idd1(new lwe(this, (byte) 10));
    public final cbr0 g;

    public ttf(kyj kyjVar, k9m0 k9m0Var, jly0 jly0Var, nac0 nac0Var, vtf vtfVar) {
        this.a = kyjVar;
        this.b = k9m0Var;
        this.c = jly0Var;
        this.d = nac0Var;
        this.e = vtfVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.G1("USERS_NEARBY_CHECK_IN", "users_nearby_check_in", 2075, "users_nearby_check_in"), new lik1("spotify:internal:users-nearby-check-in"), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4093), new t1r0(true)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-725584682, new zee(this, (byte) 13), true), new dx81(new stf(this), new m4d(this, (byte) 29), b6j0.N0, rmf.d1));
    }
}
