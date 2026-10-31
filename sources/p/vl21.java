package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vl21 implements h0r0 {
    public final qyj a;
    public final yl21 b;
    public final los c;
    public final g341 d;

    public vl21(qyj qyjVar, yl21 yl21Var, los losVar, g341 g341Var) {
        this.a = qyjVar;
        this.b = yl21Var;
        this.c = losVar;
        this.d = g341Var;
    }

    public final cbr0 a() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH5 = yon1.H5();
        Parcelable.Creator creator = lik1.CREATOR;
        return new cbr0(new dbr0[]{new bn70(p6r0VarH5, new lik1(this.b.a), (nar0) null), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, this.c, false, true, true, (nsm0) null, 3677)}, false);
    }

    public final p2r0 b() {
        return this.a.a(new j2i(892542931, new ps11(this, (byte) 16), true));
    }
}
