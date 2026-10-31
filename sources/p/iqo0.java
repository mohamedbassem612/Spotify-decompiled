package p;

import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iqo0 implements h0r0 {
    public final kyj a;
    public final oro0 b;
    public final drj0 c;
    public final qro0 d;
    public final Map e;
    public final idd1 f = new idd1(new ivn0(this, (byte) 11));
    public final cbr0 g;

    public iqo0(Resources resources, kyj kyjVar, oro0 oro0Var, drj0 drj0Var, qro0 qro0Var, Map map) {
        this.a = kyjVar;
        this.b = oro0Var;
        this.c = drj0Var;
        this.d = qro0Var;
        this.e = map;
        t1r0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.J2(), nik1.o6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4092), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        dx81 dx81Var = new dx81(new hqo0(this), new y3o0(this, (byte) 9), dj10.Q0);
        return this.a.a(apo.j(-1075098549, new x3o0(this, (byte) 3), true), dx81Var);
    }
}
