package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kwm implements h0r0 {
    public final qyj a;
    public final lwm b;
    public final hw2 c;
    public final nm1 d;
    public final nm1 e;
    public final el9 f;
    public final cbr0 g;

    public kwm(Resources resources, p6r0 p6r0Var, qyj qyjVar, lwm lwmVar, hw2 hw2Var, nm1 nm1Var, nm1 nm1Var2, el9 el9Var, e5b0 e5b0Var) {
        this.a = qyjVar;
        this.b = lwmVar;
        this.c = hw2Var;
        this.d = nm1Var;
        this.e = nm1Var2;
        this.f = el9Var;
        this.g = new cbr0(new dbr0[]{new t1r0(true), new bn70(p6r0Var, nik1.G6.b(lwmVar.d()), new nar0(tx9.p(lwmVar.d()))), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.a, (Integer) null, 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4092), new s9h1(4, true, true, true), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-588823197, new h1m(this, (byte) 18), true));
    }
}
