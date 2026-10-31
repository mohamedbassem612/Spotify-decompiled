package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wb7 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xb7 b;

    public /* synthetic */ wb7(xb7 xb7Var, byte b) {
        this.a = b;
        this.b = xb7Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        xb7 xb7Var = this.b;
        switch (b) {
            case 0:
                xb7Var.Y.onNext((fwq) obj);
                xb7Var.i();
                break;
            default:
                xb7Var.h((Throwable) obj);
                break;
        }
    }
}
