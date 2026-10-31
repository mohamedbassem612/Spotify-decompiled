package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ivp0 {
    public final ynb0 a;
    public final ynb0 b;
    public final zbg c;
    public final ynb0 d;
    public final idd1 e = new idd1(new gvp0(this, (byte) 0));
    public final idd1 f;
    public final List g;

    public ivp0(ynb0 ynb0Var, ynb0 ynb0Var2, zbg zbgVar, ynb0 ynb0Var3) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = zbgVar;
        this.d = ynb0Var3;
        new idd1(new u6j0(this, (byte) 18));
        new idd1(new gvp0(this, (byte) 1));
        this.f = new idd1(new gvp0(this, (byte) 2));
        this.g = p7h.M(tsp0.a, tsp0.b, tsp0.c);
    }

    public static ObservableRefCount b(ivp0 ivp0Var) {
        ivp0Var.getClass();
        return Observable.combineLatest((ObservableSource) ((wqp0) ivp0Var.e.getValue()).a(), (ObservableSource) ((wqp0) ivp0Var.f.getValue()).a(), (BiFunction) ws10.V0).map(new uip0(ivp0Var, (byte) 3)).map(new hvp0(ivp0Var, (byte) 0)).replay(1).f();
    }

    public final lum1 a(Set set) {
        return ((wwp) this.a.get()).a(new ium1(set, ((g35) this.d.get()).a()));
    }
}
