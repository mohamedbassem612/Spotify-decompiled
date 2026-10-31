package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nwt {
    public final Observable a;
    public final zr00 b;
    public final o241 c;
    public final bjd d;
    public final pe e;
    public final rzo0 f;
    public final Observable g;

    public nwt(Observable observable, Observable observable2, zr00 zr00Var, o241 o241Var, bjd bjdVar, pe peVar, rzo0 rzo0Var) {
        this.a = observable2;
        this.b = zr00Var;
        this.c = o241Var;
        this.d = bjdVar;
        this.e = peVar;
        this.f = rzo0Var;
        this.g = Observable.combineLatest((ObservableSource) observable, (ObservableSource) ((p241) o241Var).a.map(new pvc(this, (byte) 7)).distinctUntilChanged(), (BiFunction) ios.Y0);
    }

    public final mr20 a() {
        return rqt0.u(new pzs(new mr20[]{this.b.a, yoi1.g(this.g), this.d.b(), yoi1.g(this.a), rqt0.u(yoi1.g(this.c.a.map(new rtw0(this)))), this.f.B()}, this, (byte) 5));
    }
}
