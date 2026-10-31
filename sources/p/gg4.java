package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gg4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hg4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg4(hg4 hg4Var, byte b) {
        super(0);
        this.a = b;
        this.b = hg4Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        hg4 hg4Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = hg4Var.d;
                if (lukVar != null) {
                    return (hg4) lukVar.e(new if4(hg4Var, (byte) 17));
                }
                return null;
            default:
                tgp0 tgp0Var = hg4Var.c;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new kr60(hg4Var, (byte) 14))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
