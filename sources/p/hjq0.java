package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hjq0 implements jjq0 {
    public final lik1 a;
    public final js6 b;
    public final mfm c;
    public final yhm d;
    public final em6 e;

    public hjq0(lik1 lik1Var, js6 js6Var, mfm mfmVar, yhm yhmVar, em6 em6Var) {
        this.a = lik1Var;
        this.b = js6Var;
        this.c = mfmVar;
        this.d = yhmVar;
        this.e = em6Var;
    }

    public final Object invoke(Object obj) {
        ssi0 ssi0Var = (ssi0) obj;
        tv80 tv80Var = ssi0Var.e;
        String str = ssi0Var.b;
        fm6 fm6Var = new fm6(str, this.a, (String) null, new bm6(false, true, false, false, true, (ok51) null, false, (p860) null, 1960));
        if (this.e.a.a()) {
            this.d.a(fm6Var, tv80Var);
        } else {
            Observable observableA = this.b.a(fm6Var);
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            mfm.b(this.c, observableA, yon1.V0(), new bjm(6, str, (String) null), tv80Var, 16);
        }
        return rih1.a;
    }
}
