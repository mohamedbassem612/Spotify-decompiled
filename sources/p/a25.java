package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a25 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b25 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a25(b25 b25Var, byte b) {
        super(0);
        this.a = b;
        this.b = b25Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        b25 b25Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = b25Var.c;
                if (lukVar != null) {
                    return (b25) lukVar.e(new r05(b25Var, (byte) 10));
                }
                return null;
            default:
                tgp0 tgp0Var = b25Var.b;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new kr60(b25Var, (byte) 18))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
