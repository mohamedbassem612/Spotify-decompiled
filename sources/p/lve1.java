package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lve1 implements ObservableTransformer {
    public final short a;
    public final Object b;
    public final Scheduler c;

    /* JADX WARN: Multi-variable type inference failed */
    public lve1(int i, re70 re70Var, Scheduler scheduler) {
        this.a = i;
        re70Var.getClass();
        this.b = re70Var;
        this.c = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.publish(new ifb1(this, (byte) 16));
    }
}
