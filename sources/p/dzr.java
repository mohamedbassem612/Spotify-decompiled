package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dzr implements iu30 {
    public final n481 a;
    public final pos b;
    public final o241 c;
    public final o6v0 d;
    public final fuw0 e;

    public dzr(n481 n481Var, pos posVar, o241 o241Var, o6v0 o6v0Var, fuw0 fuw0Var) {
        this.a = n481Var;
        this.b = posVar;
        this.c = o241Var;
        this.d = o6v0Var;
        this.e = fuw0Var;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        pos posVar = this.b;
        return Observable.combineLatest(this.a.b(new b481(posVar.a, new o8z(100), 1, str != null ? new i620(str) : g620.d, posVar.b, Boolean.TRUE, Boolean.FALSE, 97824)), new ObservableFromPublisher(this.d.a()), this.c.a, this.e.a.distinctUntilChanged(), vap1.U0).share();
    }
}
