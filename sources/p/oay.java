package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oay implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Scheduler b;

    public oay() {
        this.a = (byte) 0;
        this.b = Schedulers.b;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.publish(new nay(this, (byte) 0));
            default:
                return observable.flatMap(new hfb(this.b, (byte) 24));
        }
    }

    public oay(Scheduler scheduler) {
        this.a = (byte) 1;
        this.b = scheduler;
    }
}
