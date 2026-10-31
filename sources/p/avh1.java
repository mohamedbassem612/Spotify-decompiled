package p;

import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class avh1 implements h0r0 {
    public final Resources a;
    public final qyj b;
    public final evh1 c;
    public final los d;
    public final ptf1 e;
    public final yqg f;
    public final bih1 g;
    public final Map h;
    public final idd1 i = new idd1(new dch1(this, (byte) 8));
    public final cbr0 j;

    public avh1(Resources resources, qyj qyjVar, evh1 evh1Var, los losVar, ptf1 ptf1Var, yqg yqgVar, bih1 bih1Var, Map map) {
        this.a = resources;
        this.b = qyjVar;
        this.c = evh1Var;
        this.d = losVar;
        this.e = ptf1Var;
        this.f = yqgVar;
        this.g = bih1Var;
        this.h = map;
        t1r0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.j = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.G2(), nik1.g6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.b, (Integer) null, 2, (mxb) null, losVar, false, false, false, (nsm0) null, 4052), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(1813039450, new muh1(this, (byte) 1), true));
    }
}
