package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class txj0 implements h0r0 {
    public final qyj a;
    public final f1n0 b;
    public final cbr0 c;

    public txj0(qyj qyjVar, f1n0 f1n0Var, xfq xfqVar) {
        this.a = qyjVar;
        this.b = f1n0Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarJ3 = yon1.J3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarJ3, oap1.i("spotify:internal:mixing-content-not-available"), (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(810696584, new sxj0(this, (byte) 1), true));
    }
}
