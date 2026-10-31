package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qz6 implements ebr0 {
    public ynb0 a;
    public ynb0 b;

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        pz6 pz6Var = (pz6) parcelable;
        nz6 nz6Var = (nz6) this.a.get();
        ryj ryjVar = (ryj) this.b.get();
        nz6Var.getClass();
        ryjVar.getClass();
        ((rih1) obj).getClass();
        tnm tnmVar = new tnm(nz6Var, pz6Var, q7r0Var);
        p6r0 p6r0VarU = tnmVar.u();
        qyj qyjVar = (qyj) nz6Var.j.get();
        c8o.l(qyjVar);
        return new mz6(p6r0VarU, qyjVar, pz6Var, cwl1.C(q7r0Var), xqu.a((jly0) tnmVar.h));
    }
}
