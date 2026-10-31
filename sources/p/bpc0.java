package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bpc0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2z b;

    public /* synthetic */ bpc0(g2z g2zVar, byte b) {
        this.a = b;
        this.b = g2zVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        g2z g2zVar = this.b;
        switch (b) {
            case 0:
                apc0 apc0Var = apc0.b;
                return observable.map(new nbc((byte) 14)).compose((ObservableTransformer) ((idd1) g2zVar.e).getValue()).map(sa20.t);
            default:
                return observable.observeOn((Scheduler) g2zVar.a).scan(va20.i).distinctUntilChanged().switchMap(new jl00(g2zVar, (byte) 25));
        }
    }
}
