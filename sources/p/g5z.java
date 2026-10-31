package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g5z implements h0r0 {
    public final a8e0 a;
    public final l4h1 b;
    public final nt8 c;
    public final cbr0 d;

    public g5z(o5z o5zVar, a8e0 a8e0Var, l4h1 l4h1Var, nt8 nt8Var) {
        this.a = a8e0Var;
        this.b = l4h1Var;
        this.c = nt8Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131952668));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarJ0 = yon1.J0();
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarJ0, oap1.i(o5zVar.getUri()), dug.m(yon1.J0().c, o5zVar.getUri())), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(this.c.c().firstOrError()), new nty(this, (byte) 8));
    }
}
