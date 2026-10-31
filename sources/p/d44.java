package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d44 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f44 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d44(f44 f44Var, byte b) {
        super(0);
        this.a = b;
        this.b = f44Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        f44 f44Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = f44Var.c;
                if (lukVar != null) {
                    return (f44) lukVar.e(new c44(f44Var, (byte) 0));
                }
                return null;
            default:
                tgp0 tgp0Var = f44Var.b;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new ymm0(f44Var, (byte) 13))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
