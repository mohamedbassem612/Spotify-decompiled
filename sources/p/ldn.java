package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ldn implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Flowable b;

    public /* synthetic */ ldn(Flowable flowable, byte b) {
        this.a = b;
        this.b = flowable;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Flowable flowable = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                return flowable.x(new k9p1(str, (byte) 6)).t(Functions.a).U(new kdn(true, str)).q(50L, TimeUnit.MILLISECONDS);
            default:
                return new ObservableFromPublisher(new FlowableTake(flowable.t(sa20.Z).x(ta20.Z))).map(ua20.Y);
        }
    }
}
