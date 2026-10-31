package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b020 implements ObservableTransformer {
    public final Flowable a;
    public final t7y b;
    public final vlu0 c;
    public final iyc0 d;
    public final boolean e;

    public b020(Flowable flowable, t7y t7yVar, vlu0 vlu0Var, iyc0 iyc0Var, boolean z) {
        this.a = flowable;
        this.b = t7yVar;
        this.c = vlu0Var;
        this.d = iyc0Var;
        this.e = z;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new mev(this, (byte) 15));
    }
}
