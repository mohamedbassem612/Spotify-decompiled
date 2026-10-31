package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nx4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ox4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx4(ox4 ox4Var, byte b) {
        super(0);
        this.a = b;
        this.b = ox4Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        ox4 ox4Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = ox4Var.c;
                if (lukVar != null) {
                    return (ox4) lukVar.e(new ew4(ox4Var, (byte) 11));
                }
                return null;
            default:
                tgp0 tgp0Var = ox4Var.b;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new x5j1(ox4Var, (byte) 17))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
