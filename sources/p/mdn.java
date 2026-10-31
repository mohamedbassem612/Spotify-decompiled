package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mdn implements FlowableTransformer {
    public final /* synthetic */ byte a;
    public final FlowableMap b;

    public /* synthetic */ mdn(FlowableMap flowableMap, byte b) {
        this.a = b;
        this.b = flowableMap;
    }

    public final moy0 a(Flowable flowable) {
        byte b = this.a;
        FlowableMap flowableMap = this.b;
        switch (b) {
            case 0:
                return flowableMap.X(new ldn(flowable, (byte) 0));
            default:
                return flowableMap.X(new i3b(flowable, (byte) 21));
        }
    }
}
