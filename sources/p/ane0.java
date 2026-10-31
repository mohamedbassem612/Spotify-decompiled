package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ane0 implements h0r0 {
    public final ene0 a;
    public final tme0 b;
    public final yuj c;
    public final uo5 d;
    public final fad0 e;
    public final cbr0 f;

    public ane0(ene0 ene0Var, tme0 tme0Var, yuj yujVar, uo5 uo5Var, fad0 fad0Var) {
        this.a = ene0Var;
        this.b = tme0Var;
        this.c = yujVar;
        this.d = uo5Var;
        this.e = fad0Var;
        yxe1 yxe1Var = new yxe1(new ehc1("LocationSearchPage"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarQ0 = yon1.Q0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) p6r0VarQ0, oap1.i(ene0Var.getUri()), (v8h1) x9p1.m(yon1.Q0().c, nik1.y1.a)), new qod1("location-search-page"), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.c, this.a.a() == 1 ? f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 5)) : f610.j(cov0.d), apo.j(1657799159, new kmd0(this, (byte) 9), true), new n7e0(new xme0(this), new s2c0(this, (byte) 23), xi10.Y));
    }
}
