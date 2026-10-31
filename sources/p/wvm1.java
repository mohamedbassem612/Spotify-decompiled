package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wvm1 implements h0r0 {
    public final q1n0 a;
    public final k8m0 b;
    public final v1t c;
    public final nvq d;
    public final cbr0 e;

    public wvm1(lwm1 lwm1Var, q1n0 q1n0Var, k8m0 k8m0Var, v1t v1tVar, nvq nvqVar, boolean z, e5b0 e5b0Var) {
        this.a = q1n0Var;
        this.b = k8m0Var;
        this.c = v1tVar;
        this.d = nvqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarM6 = yon1.m6();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{new bn70(p6r0VarM6, oap1.i(lwm1Var.getUri()), (nar0) null), new j0c0(mno1.j0), new yxe1(new jx21(tro1.t(z))), new t1r0(true), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return new k9r(this.a, this.b, new fak1(this, (byte) 25), (byte) 12);
    }
}
