package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w2a1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n381 b;
    public final /* synthetic */ Scheduler c;

    public /* synthetic */ w2a1(n381 n381Var, Scheduler scheduler, byte b) {
        this.a = b;
        this.b = n381Var;
        this.c = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Scheduler scheduler = this.c;
        n381 n381Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new v2a1(n381Var, scheduler, (byte) 0));
            case 1:
                return observable.flatMap(new u2a1(n381Var, scheduler));
            default:
                return observable.flatMap(new v2a1(n381Var, scheduler, (byte) 1));
        }
    }
}
