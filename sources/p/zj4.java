package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zj4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bk4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj4(bk4 bk4Var, byte b) {
        super(0);
        this.a = b;
        this.b = bk4Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        bk4 bk4Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = bk4Var.l;
                if (lukVar != null) {
                    return lukVar.e(new pi4(bk4Var, (byte) 14));
                }
                return null;
            default:
                tgp0 tgp0Var = bk4Var.k;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new x5j1(bk4Var, (byte) 15))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
