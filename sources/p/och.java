package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class och extends gn21 {
    public final g7n a;
    public final Observable b;

    public och(w8v0 w8v0Var, rfs rfsVar, String str, t881 t881Var, e481 e481Var, zdq zdqVar, ceq ceqVar, v9c v9cVar) {
        Set set = s4b1.f;
        String strJ = uic.x(str).j();
        strJ.getClass();
        g7n g7nVar = new g7n(rfsVar, w8v0Var, strJ, t881Var, (hr00) zdqVar.a.d.b3.get());
        this.a = g7nVar;
        daq daqVar = ceqVar.a.b;
        this.b = Observable.combineLatest(g7nVar, new ikl1(str, (z8o0) daqVar.a.E1.get(), (dxz0) daqVar.I4.get(), (b370) daqVar.a.I2.get()), new kba(v9cVar, (byte) 20)).distinctUntilChanged();
    }

    public final Observable a() {
        return this.b;
    }

    public final void accept(Object obj) {
        this.a.accept((w8v0) obj);
    }
}
