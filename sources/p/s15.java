package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s15 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t15 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s15(t15 t15Var, byte b) {
        super(0);
        this.a = b;
        this.b = t15Var;
    }

    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        t15 t15Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = t15Var.c;
                if (lukVar != null) {
                    return (t15) lukVar.e(new r05(t15Var, (byte) 8));
                }
                return null;
            default:
                tgp0 tgp0Var = t15Var.b;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new fl1(t15Var, (byte) 19))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
        }
    }
}
