package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jw3 implements h0r0 {
    public final yuj a;
    public final mw3 b;
    public final a2b0 c;
    public final los d;
    public final gx3 e;
    public final km3 f;
    public final i8h1 g;
    public final cbr0 h;

    public jw3(yuj yujVar, mw3 mw3Var, a2b0 a2b0Var, los losVar, gx3 gx3Var, km3 km3Var, i8h1 i8h1Var) {
        this.a = yujVar;
        this.b = mw3Var;
        this.c = a2b0Var;
        this.d = losVar;
        this.e = gx3Var;
        this.f = km3Var;
        this.g = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PARENTAL_CONTROL_MAKE_ALLOWLISTING_REQUEST", "parental-control/make-allowlisting-request", 1407, "parental-control");
        Parcelable.Creator creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(mw3Var.b), (nar0) null), new nxb((Integer) null, (ixb) null, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4063), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.a.a(new o6e0(new dt0(this, (lnm) null, (byte) 8), f46.I(new p6e0[]{new p6e0()})), new j2i(-1842858160, new v72(this, (byte) 13), true), new n7e0(new iw3(this), new xb2(this, (byte) 14), new c4x0((byte) 28), (iu30) null), new xvj(i6i.a, (j2i) null, (j2i) null, true, 54));
    }
}
