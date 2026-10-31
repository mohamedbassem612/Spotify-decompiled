package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vip0 implements iu30 {
    public final hce1 a;
    public final eip0 b;
    public final mfb0 c;
    public final gqb0 d;

    public vip0(hce1 hce1Var, eip0 eip0Var, mfb0 mfb0Var, gqb0 gqb0Var) {
        this.a = hce1Var;
        this.b = eip0Var;
        this.c = mfb0Var;
        this.d = gqb0Var;
    }

    public final Object invoke(Object obj) {
        m560 m560Var = (m560) obj;
        hce1 hce1Var = this.a;
        return Observable.combineLatest(((Single) ((na) hce1Var.c).invoke()).flatMapObservable(new ilh1(m560Var, hce1Var, (byte) 5)), (ObservableSource) this.b.invoke(), this.c.a.distinctUntilChanged(), (ObservableSource) this.d.invoke(m560Var), c710.S0).map(f610.S0).scan(o610.T0).map(new uip0(m560Var, (byte) 0));
    }
}
