package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tde implements h0r0 {
    public final kyj a;
    public final qde b;
    public final cce c;

    public tde(kyj kyjVar, qde qdeVar, cce cceVar) {
        this.a = kyjVar;
        this.b = qdeVar;
        this.c = cceVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.o0(), nik1.R3, (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new ktl1(32)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1124935264, new hp9(this, (byte) 29), true), new dx81(new sde(this), jzd.U0, ns80.R0, jzd.V0));
    }
}
