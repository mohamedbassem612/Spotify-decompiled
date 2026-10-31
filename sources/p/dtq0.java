package p;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dtq0 extends x7e0 implements Consumer, ObservableSource {
    public final rku X;
    public BehaviorSubject Y;
    public final etq0 d;
    public final iu30 e;
    public final iu30 f;
    public final Function0 g;
    public final ioc h;
    public final dp5 i;
    public atq0 t;

    public dtq0(etq0 etq0Var, tjf0 tjf0Var, iu30 iu30Var, ioc iocVar, dp5 dp5Var, int i) {
        tjf0Var = (i & 2) != 0 ? rfq0.W0 : tjf0Var;
        wso0 wso0Var = wso0.Z0;
        this.d = etq0Var;
        this.e = tjf0Var;
        this.f = iu30Var;
        this.g = wso0Var;
        this.h = iocVar;
        this.i = dp5Var;
        this.X = new rku();
    }

    public final void accept(Object obj) {
        this.d.accept(obj);
    }

    public final void e() {
        this.h.d();
        this.i.n();
        this.Y = BehaviorSubject.f();
        this.X.b(this.d.b().compose(new o4e0(this, (byte) 9)).doOnNext(new btq0(this, (byte) 1)).filter(ok10.T0).map(sl10.X0).subscribe(new btq0(this, (byte) 0)));
    }

    public final void f() {
        this.X.a();
        this.g.invoke();
    }

    public final void subscribe(Observer observer) {
        BehaviorSubject behaviorSubject = this.Y;
        if (behaviorSubject != null) {
            behaviorSubject.subscribe(observer);
        } else {
            u890.C("modelSubject");
            throw null;
        }
    }
}
