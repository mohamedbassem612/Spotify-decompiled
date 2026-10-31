package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ef90 implements iu30 {
    public final /* synthetic */ byte a;
    public final Flowable b;

    public /* synthetic */ ef90(Flowable flowable, byte b) {
        this.a = b;
        this.b = flowable;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Flowable flowable = this.b;
        switch (b) {
            case 0:
                return new ObservableFromPublisher(flowable.J(new yjp1((byte) 11, this, (String) obj))).distinctUntilChanged();
            default:
                return new ObservableFromPublisher(flowable.J(new zjp1((byte) 5, this, (String) obj))).distinctUntilChanged();
        }
    }
}
