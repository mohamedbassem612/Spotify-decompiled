package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o7v0 implements h0r0 {
    public final ix81 a;
    public final n59 b;
    public final cbr0 c;

    public o7v0(ix81 ix81Var, n59 n59Var, r7v0 r7v0Var) {
        this.a = ix81Var;
        this.b = n59Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131960240));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarR3 = yon1.R3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarR3, oap1.i(r7v0Var.a()), (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(new n5u0(this, (byte) 18));
    }
}
