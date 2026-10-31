package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kof implements h0r0 {
    public final fta a;
    public final pof b;
    public final kyj c;
    public final add d;
    public final k5p e;
    public final n5p f;
    public final q5p g;
    public final pd71 h;
    public final cbr0 i;

    public kof(fta ftaVar, pof pofVar, kyj kyjVar, add addVar, los losVar, k5p k5pVar, n5p n5pVar, q5p q5pVar, pd71 pd71Var) {
        this.a = ftaVar;
        this.b = pofVar;
        this.c = kyjVar;
        this.d = addVar;
        this.e = k5pVar;
        this.f = n5pVar;
        this.g = q5pVar;
        this.h = pd71Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarC0 = yon1.C0();
        Parcelable.Creator creator = lik1.CREATOR;
        this.i = new cbr0(new dbr0[]{new bn70(p6r0VarC0, oap1.i(pofVar.getViewUri()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4061), new kce0(), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return this.c.a(apo.j(614213307, new zee(this, (byte) 12), true), this.a.s());
    }
}
