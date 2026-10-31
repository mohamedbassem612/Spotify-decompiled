package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o4y0 implements h0r0 {
    public final qyj a;
    public final p4y0 b;
    public final ngs0 c;
    public final cbr0 d;

    public o4y0(Resources resources, qyj qyjVar, p4y0 p4y0Var, ngs0 ngs0Var) {
        this.a = qyjVar;
        this.b = p4y0Var;
        this.c = ngs0Var;
        t1r0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{t1r0Var, new bn70((n6r0) yon1.I2(), nik1.m6, (v8h1) rc2.C()), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.b, (Integer) null, 2, (mxb) null, (los) null, false, false, false, (nsm0) null, 4084), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1058475305, new y6w0(this, (byte) 16), true));
    }
}
