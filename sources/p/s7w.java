package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s7w implements h0r0 {
    public final v7w a;
    public final qyj b;
    public final los c;
    public final x6w d;
    public final f1n0 e;
    public final ynb0 f;
    public final tdl0 g = bbp1.n();
    public final cbr0 h;

    public s7w(v7w v7wVar, qyj qyjVar, los losVar, x6w x6wVar, f1n0 f1n0Var, ynb0 ynb0Var) {
        this.a = v7wVar;
        this.b = qyjVar;
        this.c = losVar;
        this.d = x6wVar;
        this.e = f1n0Var;
        this.f = ynb0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH3 = yon1.H3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{new bn70(p6r0VarH3, oap1.i(v7wVar.d()), (nar0) null), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(762890736, new utt(this, (byte) 25), true));
    }
}
