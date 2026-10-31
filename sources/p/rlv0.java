package p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rlv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ObservableEmitter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rlv0(ObservableEmitter observableEmitter, byte b) {
        super(1);
        this.a = b;
        this.b = observableEmitter;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ObservableEmitter observableEmitter = this.b;
        switch (b) {
            case 0:
                observableEmitter.onNext(new jn41(obj));
                break;
            case 1:
                observableEmitter.onNext(((Boolean) obj).booleanValue() ? tfi1.a : dgi1.a);
                break;
            default:
                observableEmitter.onNext(((Boolean) obj).booleanValue() ? vfi1.a : zfi1.a);
                break;
        }
        return rih1Var;
    }
}
