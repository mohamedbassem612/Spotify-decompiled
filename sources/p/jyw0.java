package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jyw0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;
    public final /* synthetic */ lis c;
    public final /* synthetic */ lls0 d;

    public /* synthetic */ jyw0(Scheduler scheduler, lis lisVar, lls0 lls0Var, byte b) {
        this.a = b;
        this.b = scheduler;
        this.c = lisVar;
        this.d = lls0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        lls0 lls0Var = this.d;
        lis lisVar = this.c;
        Scheduler scheduler = this.b;
        switch (b) {
            case 0:
                return observable.observeOn(scheduler).switchMapSingle(new xmu0(lisVar, lls0Var, (byte) 17));
            default:
                return observable.observeOn(scheduler).switchMapSingle(new yqu0(lisVar, lls0Var, (byte) 16));
        }
    }
}
