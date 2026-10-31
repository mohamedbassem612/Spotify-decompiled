package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x4t0 implements h0r0 {
    public final hvj a;
    public final w4t0 b;
    public final a5t0 c;
    public final ul7 d;
    public final pxp e;
    public final qxp f;
    public final cbr0 g;

    public x4t0(hvj hvjVar, w4t0 w4t0Var, a5t0 a5t0Var, ul7 ul7Var, pxp pxpVar, qxp qxpVar) {
        this.a = hvjVar;
        this.b = w4t0Var;
        this.c = a5t0Var;
        this.d = ul7Var;
        this.e = pxpVar;
        this.f = qxpVar;
        tc30 tc30Var = new tc30(1);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarI6 = yon1.i6();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{tc30Var, new bn70(p6r0VarI6, oap1.i(a5t0Var.getUri()), (nar0) null), new pu00(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.b), apo.j(578417680, new n1r0(this, (byte) 25), true));
    }
}
