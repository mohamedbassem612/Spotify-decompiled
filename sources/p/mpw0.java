package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mpw0 implements h0r0 {
    public final qyj a;
    public final opw0 b;
    public final zpw0 c;
    public final a1r0 d;
    public final yeu0 e;
    public final cbr0 f;

    public mpw0(Resources resources, qyj qyjVar, opw0 opw0Var, zpw0 zpw0Var, a1r0 a1r0Var, yeu0 yeu0Var) {
        this.a = qyjVar;
        this.b = opw0Var;
        this.c = zpw0Var;
        this.d = a1r0Var;
        this.e = yeu0Var;
        t1r0 t1r0Var = new t1r0(true);
        yxe1 yxe1Var = new yxe1(new jx21(2131960425));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, yxe1Var, new bn70(yon1.K2(), nik1.n6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), ixb.a, (Integer) null, 2, (mxb) null, (los) null, false, false, false, (nsm0) null, 4084), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(206584544, new y6w0(this, (byte) 6), true));
    }
}
