package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g0c1 implements Function0 {
    public final Flowable a;
    public final ruz b;

    public g0c1(Flowable flowable, ruz ruzVar) {
        this.a = flowable;
        this.b = ruzVar;
    }

    public final Object invoke() {
        return new ObservableFromPublisher(this.a).firstOrError().flatMap(new o2b1(this, (byte) 3));
    }
}
