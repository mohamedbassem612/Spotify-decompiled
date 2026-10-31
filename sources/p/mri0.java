package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mri0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nri0 b;

    public /* synthetic */ mri0(nri0 nri0Var, byte b) {
        this.a = b;
        this.b = nri0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        nri0 nri0Var = this.b;
        switch (b) {
            case 0:
                nri0Var.g = (lri0) obj;
                nri0Var.i();
                break;
            default:
                nri0Var.h((Throwable) obj);
                break;
        }
    }
}
