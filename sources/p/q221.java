package p;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q221 implements h0r0 {
    public final t221 a;
    public final yuj b;
    public final p021 c;
    public final j221 d;
    public final hyy0 e;
    public final cbr0 f;

    public q221(los losVar, t221 t221Var, yuj yujVar, p021 p021Var, j221 j221Var, hyy0 hyy0Var, Resources resources) {
        this.a = t221Var;
        this.b = yujVar;
        this.c = p021Var;
        this.d = j221Var;
        this.e = hyy0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        bn70 bn70Var = new bn70(yon1.b1(), nik1.p5, (nar0) null);
        int i = (int) (resources.getDisplayMetrics().heightPixels * 0.6f);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        this.f = new cbr0(new dbr0[]{bn70Var, new nxb(Integer.valueOf(i), f / (f2 == 0.0f ? 1.0f : f2) < 500.0f ? ixb.b : ixb.a, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 1, (mxb) null, losVar, false, false, false, (nsm0) null, 4048), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        p021 p021Var = this.c;
        p021Var.k();
        m6e0 m6e0VarL = p021Var.l();
        n7e0 n7e0Var = new n7e0(new p221(this), new ps11(this, (byte) 9), r6x0.g, i021.g);
        return yuj.b(this.b, m6e0VarL, apo.j(-955309159, new g001(this, (byte) 27), true), n7e0Var);
    }
}
