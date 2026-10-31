package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rr61 implements h0r0 {
    public final z7e0 a;
    public final l4h1 b;
    public final gs61 c;
    public final cbr0 d;

    public rr61(ps61 ps61Var, z7e0 z7e0Var, l4h1 l4h1Var, gs61 gs61Var) {
        this.a = z7e0Var;
        this.b = l4h1Var;
        this.c = gs61Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131952675));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarI0 = yon1.I0();
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarI0, oap1.i(ps61Var.getUri()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return z7e0.a(this.a, this.c, new q961(this, (byte) 10));
    }
}
