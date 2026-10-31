package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f84 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g84 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f84(g84 g84Var, byte b) {
        super(0);
        this.a = b;
        this.b = g84Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        byte b2 = 15;
        g84 g84Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = g84Var.d;
                if (lukVar != null) {
                    return (g84) lukVar.e(new k54(g84Var, b2));
                }
                return null;
            default:
                tgp0 tgp0Var = g84Var.c;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new t7o0(g84Var, (byte) 15))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
