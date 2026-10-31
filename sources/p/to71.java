package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class to71 {
    public final xy40 a;
    public final d7b b;
    public final i4q c;
    public final cex0 d;
    public final s880 e;

    public to71(xy40 xy40Var, d7b d7bVar, i4q i4qVar, cex0 cex0Var, s880 s880Var) {
        this.a = xy40Var;
        this.b = d7bVar;
        this.c = i4qVar;
        this.d = cex0Var;
        this.e = s880Var;
    }

    public final void a(w4i1 w4i1Var, tv80 tv80Var, za21 za21Var) {
        String str = w4i1Var.a;
        String strJ = pcf.j(str);
        mfm mfmVarA = this.c.a(new lik1(strJ));
        Observable observableL = anm1.L(o6x.a, new xd1(this, str, w4i1Var, za21Var, strJ, (lnm) null));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableL, yon1.d1(), (bjm) null, tv80Var, 20);
    }
}
