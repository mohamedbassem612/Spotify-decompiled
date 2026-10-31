package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b26 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c26 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b26(c26 c26Var, byte b) {
        super(0);
        this.a = b;
        this.b = c26Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        c26 c26Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = c26Var.e;
                if (lukVar != null) {
                    return (c26) lukVar.e(new s65(c26Var, (byte) 29));
                }
                return null;
            default:
                tgp0 tgp0Var = c26Var.d;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new ymm0(c26Var, (byte) 19))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
