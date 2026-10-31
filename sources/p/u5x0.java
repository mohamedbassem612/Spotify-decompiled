package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u5x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;
    public final /* synthetic */ kp5 c;

    public /* synthetic */ u5x0(Scheduler scheduler, kp5 kp5Var, byte b) {
        this.a = b;
        this.b = scheduler;
        this.c = kp5Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        kp5 kp5Var = this.c;
        Scheduler scheduler = this.b;
        switch (b) {
            case 0:
                return observable.observeOn(scheduler).flatMap(new uqv0(kp5Var, (byte) 5));
            default:
                return observable.observeOn(scheduler).switchMap(new jkp0(kp5Var, (byte) 24));
        }
    }
}
