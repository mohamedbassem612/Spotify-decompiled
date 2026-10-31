package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wzf implements wgc0 {
    public final ov20 a;
    public final jk4 b;
    public final idd1 c = new idd1(df.X);

    public wzf(ov20 ov20Var, jk4 jk4Var) {
        this.a = ov20Var;
        this.b = jk4Var;
    }

    @Override // p.wgc0
    public final mr20 a() {
        Observable observableH;
        jk4 jk4Var = this.b;
        if (jk4Var.b != null) {
            observableH = ((Observable) jk4Var.d.getValue()).map(mif1.i).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(jk4Var.a);
        }
        return hu20.e(yoi1.g(observableH), new b7c((lnm) null, this, (byte) 8));
    }
}
