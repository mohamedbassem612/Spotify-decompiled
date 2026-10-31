package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class szf implements h0r0 {
    public final kyj a;
    public final pzf b;
    public final cbr0 c;

    public szf(kyj kyjVar, pzf pzfVar) {
        this.a = kyjVar;
        this.b = pzfVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.E0(), nik1.k4, (nar0) null), new yxe1(new jx21(2131953844)), new hgr0(egr0.a, 0, 2), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(ici.a, new dx81(new rzf(this), new rs7(this, (byte) 23), new mhc((byte) 1)));
    }
}
