package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pqm0 implements h0r0 {
    public final qyj a;
    public final rqm0 b;
    public final q7r0 c;
    public final l7p d;
    public final h0p e;

    public pqm0(qyj qyjVar, rqm0 rqm0Var, q7r0 q7r0Var, l7p l7pVar, h0p h0pVar) {
        this.a = qyjVar;
        this.b = rqm0Var;
        this.c = q7r0Var;
        this.d = l7pVar;
        this.e = h0pVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarS0 = yon1.S0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        return new cbr0(new dbr0[]{new bn70(p6r0VarS0, oap1.i(this.b.getPageUri()), (nar0) null), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, true, false, (nsm0) null, 3965)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(263809390, new fhk0(this, (byte) 3), true));
    }
}
