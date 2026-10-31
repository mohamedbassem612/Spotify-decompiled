package p;

import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class koc1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FlowableEmitter b;

    public /* synthetic */ koc1(FlowableEmitter flowableEmitter, byte b) {
        this.a = b;
        this.b = flowableEmitter;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        FlowableEmitter flowableEmitter = this.b;
        switch (b) {
            case 0:
                flowableEmitter.onNext(obj);
                break;
            default:
                flowableEmitter.tryOnError((Throwable) obj);
                break;
        }
    }
}
