package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kzv implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;
    public final /* synthetic */ lls0 c;
    public final /* synthetic */ r0w d;

    public kzv(Scheduler scheduler, r0w r0wVar, lls0 lls0Var) {
        this.a = (byte) 2;
        this.b = scheduler;
        this.d = r0wVar;
        this.c = lls0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        lls0 lls0Var = this.c;
        r0w r0wVar = this.d;
        Scheduler scheduler = this.b;
        switch (b) {
            case 0:
                return observable.observeOn(scheduler).switchMapSingle(new otu(lls0Var, r0wVar, (byte) 9));
            case 1:
                return observable.observeOn(scheduler).switchMapSingle(new jut(lls0Var, r0wVar, (byte) 14));
            default:
                return observable.observeOn(scheduler).doOnNext(new cfs(r0wVar, (byte) 17)).switchMapSingle(new gmt(lls0Var, r0wVar, (byte) 17));
        }
    }

    public /* synthetic */ kzv(Scheduler scheduler, lls0 lls0Var, r0w r0wVar, byte b) {
        this.a = b;
        this.b = scheduler;
        this.c = lls0Var;
        this.d = r0wVar;
    }
}
