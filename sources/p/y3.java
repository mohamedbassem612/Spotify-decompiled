package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y3 implements h0r0 {
    public final qyj a;
    public final cbr0 b;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public y3(Resources resources, p6r0 p6r0Var, qyj qyjVar, z3 z3Var) {
        this.a = qyjVar;
        this.b = new cbr0(new dbr0[]{new t1r0(true), new bn70(p6r0Var, nik1.H6.b(z3Var.d()), (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.4f)), ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4092)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.b;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(o2i.a);
    }
}
