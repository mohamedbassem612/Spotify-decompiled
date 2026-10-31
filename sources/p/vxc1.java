package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vxc1 implements h0r0 {
    public final hvj a;
    public final zxc1 b;
    public final vi11 c;
    public final ua91 d;
    public final cbr0 e;

    public vxc1(hvj hvjVar, zxc1 zxc1Var, vi11 vi11Var, ua91 ua91Var) {
        this.a = hvjVar;
        this.b = zxc1Var;
        this.c = vi11Var;
        this.d = ua91Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131963214));
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, t1r0Var, s9h1Var, new bn70(yon1.w2(), nik1.z4.b(v1p1.p(zxc1Var.a())), new nar0(sok.x()))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 14)), apo.j(1244480110, new bxb1(this, (byte) 14), true));
    }
}
