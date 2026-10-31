package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class spm1 implements yum1 {
    public final lik1 a;
    public final eqm1 b;
    public final boolean c;
    public final i4q d;

    public spm1(lik1 lik1Var, eqm1 eqm1Var, xrm1 xrm1Var, boolean z, i4q i4qVar) {
        this.a = lik1Var;
        this.b = eqm1Var;
        this.c = z;
        this.d = i4qVar;
    }

    @Override // p.yum1
    public final boolean a(String str) {
        return xrm1.a(str);
    }

    @Override // p.yum1
    public final void b(ssi0 ssi0Var) {
        String str = ssi0Var.b;
        if (this.c) {
            String str2 = ssi0Var.d;
            eqm1 eqm1Var = this.b;
            Observable observableG1 = eqm1Var.e.g1(str, str2);
            lik1 lik1Var = this.a;
            Observable map = observableG1.map(new cik1(eqm1Var, lik1Var, str, str2, (byte) 12));
            mfm mfmVarA = this.d.a(lik1Var);
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            mfm.b(mfmVarA, map, yon1.d1(), new bjm(6, str, (String) null), ssi0Var.e, 16);
        }
    }
}
