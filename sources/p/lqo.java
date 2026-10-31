package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lqo implements h0r0 {
    public final u9c0 a;
    public final qyj b;
    public final nqo c;
    public final ham d;
    public final q8n e;
    public final ynb0 f;
    public final y441 g;
    public final cbr0 h;

    public lqo(Resources resources, u9c0 u9c0Var, qyj qyjVar, los losVar, nqo nqoVar, ham hamVar, q8n q8nVar, ynb0 ynb0Var, y441 y441Var) {
        this.a = u9c0Var;
        this.b = qyjVar;
        this.c = nqoVar;
        this.d = hamVar;
        this.e = q8nVar;
        this.f = ynb0Var;
        this.g = y441Var;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.p1(), new lik1(nqoVar.getPageUri()), (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.6f)), (ixb) null, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4062), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.b.a(apo.j(-991638676, new i4o(this, (byte) 2), true));
    }
}
