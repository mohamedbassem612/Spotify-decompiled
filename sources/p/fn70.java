package p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fn70 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ObservableEmitter b;

    public /* synthetic */ fn70(ObservableEmitter observableEmitter, byte b) {
        this.a = b;
        this.b = observableEmitter;
    }

    public final void b(Object obj) {
        byte b = this.a;
        ObservableEmitter observableEmitter = this.b;
        switch (b) {
            case 0:
                observableEmitter.onNext(spq0.a((bn70) obj));
                break;
            default:
                bn70 bn70Var = (bn70) obj;
                if (bn70Var != null) {
                    observableEmitter.onNext(new eir0(bn70Var.a, bn70Var.b.a(), 4));
                }
                break;
        }
    }
}
