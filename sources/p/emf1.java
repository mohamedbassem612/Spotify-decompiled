package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class emf1 implements h0r0 {
    public final qyj a;
    public final fmf1 b;
    public final qmf1 c;
    public final cbr0 d;

    public emf1(Resources resources, p6r0 p6r0Var, qyj qyjVar, fmf1 fmf1Var, qmf1 qmf1Var) {
        this.a = qyjVar;
        this.b = fmf1Var;
        this.c = qmf1Var;
        this.d = new cbr0(new dbr0[]{new t1r0(true), new bn70((n6r0) p6r0Var, nik1.F6.b(fmf1Var.d()), (v8h1) kbb.J(p6r0Var.c, fmf1Var.d())), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.4f)), ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4092), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1387727224, new wcf1(this, (byte) 8), true));
    }
}
