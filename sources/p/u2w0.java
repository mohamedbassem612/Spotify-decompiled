package p;

import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u2w0 implements h0r0 {
    public final a8e0 a;
    public final x0w0 b;
    public final aru0 c;
    public final w2w0 d;
    public final rsn0 e;
    public final abm f;
    public final rh4 g;
    public final cbr0 h;

    public u2w0(a8e0 a8e0Var, x0w0 x0w0Var, aru0 aru0Var, w2w0 w2w0Var, rsn0 rsn0Var, abm abmVar, rh4 rh4Var) {
        this.a = a8e0Var;
        this.b = x0w0Var;
        this.c = aru0Var;
        this.d = w2w0Var;
        this.e = rsn0Var;
        this.f = abmVar;
        this.g = rh4Var;
        yxe1 yxe1Var = new yxe1(new ehc1("Prerelease Album Page"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH4 = yon1.h4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        Set set = s4b1.f;
        String strZ = uic.x(w2w0Var.a).z();
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarH4, oap1.i(strZ == null ? "" : strZ), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(bbp1.g(this.c.e(this.d.a).map(new yrg0(this, (byte) 8))), new xy50(this, (byte) 27), new u7r0(a4p1.n(), null, null, false, false, 126));
    }
}
