package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oo51 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qo51 b;

    public /* synthetic */ oo51(qo51 qo51Var, byte b) {
        this.a = b;
        this.b = qo51Var;
    }

    public final void run() {
        byte b = this.a;
        qo51 qo51Var = this.b;
        switch (b) {
            case 0:
                qo51Var.d.accept(iu41.a);
                qo51Var.h.onNext(Boolean.TRUE);
                break;
            case 1:
                qo51Var.d.accept(gu41.a);
                qo51Var.h.onNext(Boolean.FALSE);
                break;
            default:
                lgv.b(qo51Var.g);
                break;
        }
    }
}
