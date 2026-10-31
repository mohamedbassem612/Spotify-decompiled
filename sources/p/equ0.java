package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class equ0 implements h0r0 {
    public final hvj a;
    public final dqu0 b;
    public final xrp c;
    public final cbr0 d;

    public equ0(hvj hvjVar, fqu0 fqu0Var, dqu0 dqu0Var, xrp xrpVar) {
        this.a = hvjVar;
        this.b = dqu0Var;
        this.c = xrpVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131960094));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.K3(), fqu0Var.getViewUri(), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.b), apo.j(1581269894, new dvt0(this, (byte) 2), true));
    }
}
