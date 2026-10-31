package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qi11 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ri11 b;

    public /* synthetic */ qi11(ri11 ri11Var, byte b) {
        this.a = b;
        this.b = ri11Var;
    }

    public final void run() {
        byte b = this.a;
        ri11 ri11Var = this.b;
        switch (b) {
            case 0:
                lgv.b(ri11Var.X);
                break;
            case 1:
                ri11Var.d.accept(gu41.a);
                ri11Var.Y.onNext(Boolean.FALSE);
                break;
            default:
                ri11Var.d.accept(iu41.a);
                ri11Var.Y.onNext(Boolean.TRUE);
                break;
        }
    }
}
