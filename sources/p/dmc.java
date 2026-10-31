package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dmc implements cmc {
    public final zeu0 a;
    public final gx5 b;
    public final wic c;
    public final kmc d;
    public udu0 e;

    public dmc(zeu0 zeu0Var, gx5 gx5Var, wic wicVar, kmc kmcVar) {
        this.a = zeu0Var;
        this.b = gx5Var;
        this.c = wicVar;
        this.d = kmcVar;
    }

    public final Observable a() {
        ObservableSource observableSourceHide = this.c.a.hide();
        kmc kmcVar = this.d;
        return Observable.combineLatest(observableSourceHide, kmcVar.a.map(new n4b(kmcVar, (byte) 2)), (BiFunction) s321.O0).filter(u321.O0).take(1L).flatMap(new uq8(this, (byte) 5));
    }
}
