package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ab41 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Flowable b;

    public /* synthetic */ ab41(Flowable flowable, byte b) {
        this.a = b;
        this.b = flowable;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Flowable flowable = this.b;
        switch (b) {
            case 0:
                flowable.getClass();
                return new ObservableFromPublisher(flowable).take(1L).map(p5x0.i);
            default:
                hu41 hu41Var = (ju41) obj;
                if (hu41Var instanceof iu41) {
                    int i = Flowable.a;
                    return FlowableEmpty.b;
                }
                if (hu41Var instanceof hu41) {
                    return Flowable.I(new evf1(hu41Var.a, 2));
                }
                if (hu41Var instanceof gu41) {
                    return flowable.J(wdx0.S0);
                }
                eg.o();
                return null;
        }
    }
}
