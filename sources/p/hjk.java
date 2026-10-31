package p;

import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hjk implements h0r0 {
    public final q7e0 a;
    public final djk b;
    public final go6 c;
    public final kba d;
    public final lls0 e;
    public final njk f;
    public final sd41 g;
    public final sw9 h;
    public final xrk i;
    public final q8n j;
    public final cbr0 k;

    public hjk(q7e0 q7e0Var, djk djkVar, go6 go6Var, kba kbaVar, lls0 lls0Var, njk njkVar, sd41 sd41Var, sw9 sw9Var, xrk xrkVar, q8n q8nVar) {
        this.a = q7e0Var;
        this.b = djkVar;
        this.c = go6Var;
        this.d = kbaVar;
        this.e = lls0Var;
        this.f = njkVar;
        this.g = sd41Var;
        this.h = sw9Var;
        this.i = xrkVar;
        this.j = q8nVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarR0 = yon1.R0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        String uri = njkVar.getUri();
        Set set = s4b1.f;
        String strZ = uic.x(uri).z();
        this.k = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) p6r0VarR0, oap1.i(strZ != null ? strZ : ""), (v8h1) i6p1.o(yon1.R0().c, njkVar.getUri())), new j0c0(mno1.C), new qod1("Live Event Page"), u17.b, new s9h1(14, true, false, false), new t1r0(true), new kce0(), new q1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.k;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        o6e0 o6e0VarE = f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 3));
        mwh mwhVar = new mwh(this, (byte) 19);
        n7e0 n7e0Var = new n7e0(new gjk(this), yzj.Y, zp8.R0);
        k391 k391Var = z391.X;
        return this.a.a(o6e0VarE, mwhVar, n7e0Var, new u7r0(a4p1.v(new e491[]{z391.d, z391.h, k391Var, k391Var}), a4p1.q(), null, false, false, 124));
    }
}
