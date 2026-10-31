package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sb40 {
    public final o241 a;
    public final ek4 b;

    public sb40(o241 o241Var, ek4 ek4Var) {
        this.a = o241Var;
        this.b = ek4Var;
    }

    public final ezc a() {
        Observable observableH;
        ek4 ek4Var = this.b;
        if (ek4Var.i != null) {
            observableH = ((Observable) ek4Var.k.getValue()).map(j561.g).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(ek4Var.a);
        }
        return yoi1.g(observableH);
    }

    public final ezc b() {
        Observable observableH;
        ek4 ek4Var = this.b;
        if (ek4Var.i != null) {
            observableH = ((Observable) ek4Var.k.getValue()).map(mpi1.g).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(ek4Var.f);
        }
        return yoi1.g(observableH);
    }

    public final Observable c() {
        return this.a.a("can-block-content", "0").map(ua20.d).onErrorReturnItem(lfd.d);
    }
}
