package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class imd implements h0r0 {
    public final a1r0 a;
    public final qyj b;
    public final qmd c;
    public final yqg d;
    public final xid e;
    public final los f;
    public final bf4 g;
    public final cbr0 h;

    public imd(Resources resources, a1r0 a1r0Var, qyj qyjVar, qmd qmdVar, yqg yqgVar, xid xidVar, los losVar, bf4 bf4Var) {
        this.a = a1r0Var;
        this.b = qyjVar;
        this.c = qmdVar;
        this.d = yqgVar;
        this.e = xidVar;
        this.f = losVar;
        this.g = bf4Var;
        t1r0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.H2(), nik1.i6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4060), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(1072426117, new cka(this, (byte) 20), true));
    }
}
