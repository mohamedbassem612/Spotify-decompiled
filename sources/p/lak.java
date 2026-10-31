package p;

import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lak implements h0r0 {
    public final q7e0 a;
    public final nak b;
    public final sak c;
    public final wbk d;
    public final rm5 e;
    public final k9k f;
    public final uu00 g;
    public final q8n h;
    public final cbr0 i;

    public lak(q7e0 q7e0Var, nak nakVar, sak sakVar, wbk wbkVar, rm5 rm5Var, k9k k9kVar, uu00 uu00Var, q8n q8nVar) {
        this.a = q7e0Var;
        this.b = nakVar;
        this.c = sakVar;
        this.d = wbkVar;
        this.e = rm5Var;
        this.f = k9kVar;
        this.g = uu00Var;
        this.h = q8nVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131954183));
        j0c0 j0c0Var = new j0c0(mno1.t);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarP0 = yon1.P0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        String uri = nakVar.getUri();
        Set set = s4b1.f;
        String strZ = uic.x(uri).z();
        this.i = new cbr0(new dbr0[]{yxe1Var, j0c0Var, new bn70(p6r0VarP0, oap1.i(strZ == null ? "" : strZ), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return q7e0.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 2)), new mwh(this, (byte) 16), new n7e0(new fak(this), yzj.e, wcp1.Q0));
    }
}
