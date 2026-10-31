package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gb4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb4(hb4 hb4Var, byte b) {
        super(0);
        this.a = b;
        this.b = hb4Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = hb4Var.u;
                if (lukVar != null) {
                    return lukVar.e(new l94(hb4Var, (byte) 7));
                }
                return null;
            default:
                tgp0 tgp0Var = hb4Var.t;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new fl1(hb4Var, (byte) 15))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
