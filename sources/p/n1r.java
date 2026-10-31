package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1r extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ObservableEmitter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1r(ObservableEmitter observableEmitter, byte b) {
        super(0);
        this.a = b;
        this.b = observableEmitter;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ObservableEmitter observableEmitter = this.b;
        switch (b) {
            case 0:
                observableEmitter.onNext(rih1Var);
                break;
            case 1:
                observableEmitter.onNext(kn41.a);
                break;
            case 2:
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(k6x0.a);
                    observableEmitter.onComplete();
                }
                break;
            case 3:
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onComplete();
                }
                break;
            case 4:
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(i6x0.a);
                    observableEmitter.onComplete();
                }
                break;
            case 5:
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onComplete();
                }
                break;
            case 6:
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onComplete();
                }
                break;
            case 7:
                observableEmitter.onNext(rfi1.a);
                break;
            case 8:
                observableEmitter.onNext(bgi1.a);
                break;
            case 9:
                observableEmitter.onNext(ufi1.a);
                break;
            default:
                observableEmitter.onNext(xfi1.a);
                break;
        }
        return rih1Var;
    }
}
