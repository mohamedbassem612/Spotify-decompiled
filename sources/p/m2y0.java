package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m2y0 implements h0r0 {
    public final yuj a;
    public final s67 b;
    public final w2y0 c;
    public final p40 d;
    public final hz5 e;
    public final xmu0 f;
    public final kt91 g;
    public final v67 h;
    public final cbr0 i;

    public m2y0(Resources resources, yuj yujVar, s67 s67Var, w2y0 w2y0Var, p40 p40Var, hz5 hz5Var, xmu0 xmu0Var, kt91 kt91Var, v67 v67Var, e5b0 e5b0Var) {
        this.a = yujVar;
        this.b = s67Var;
        this.c = w2y0Var;
        this.d = p40Var;
        this.e = hz5Var;
        this.f = xmu0Var;
        this.g = kt91Var;
        this.h = v67Var;
        t1r0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.F2(), nik1.f6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), ixb.a, (Integer) null, 2, (mxb) null, (los) null, false, false, false, (nsm0) null, 4084), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        m6e0 m6e0VarG = f4p1.g(this.b);
        n7e0 n7e0Var = new n7e0(new k2y0(this), gbw0.b1, r3x0.c);
        return yuj.b(this.a, m6e0VarG, apo.j(-1319642980, new ixt0(this, (byte) 15), true), n7e0Var);
    }
}
