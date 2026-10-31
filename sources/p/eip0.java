package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eip0 implements Function0 {
    public final /* synthetic */ byte a;
    public final Flowable b;

    public /* synthetic */ eip0(Flowable flowable, byte b) {
        this.a = b;
        this.b = flowable;
    }

    public final Object invoke() {
        byte b = this.a;
        Flowable flowable = this.b;
        switch (b) {
            case 0:
                return new ObservableFromPublisher(flowable.j(mo9.Y).x(zj20.P0)).map(ak20.P0).startWith(Single.just(x9m.a)).distinctUntilChanged();
            default:
                return new ObservableFromPublisher(flowable.J(new ekb(this, (byte) 26)));
        }
    }
}
