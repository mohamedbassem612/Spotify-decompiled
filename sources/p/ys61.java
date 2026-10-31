package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ys61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zs61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys61(zs61 zs61Var, byte b) {
        super(0);
        this.a = b;
        this.b = zs61Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        zs61 zs61Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = zs61Var.e;
                if (lukVar != null) {
                    return (zs61) lukVar.e(new e4n0(zs61Var, (byte) 16));
                }
                return null;
            default:
                tgp0 tgp0Var = zs61Var.d;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new n801((Object) zs61Var, (byte) 21))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
