package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class je7 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ le7 b;

    public /* synthetic */ je7(le7 le7Var, byte b) {
        this.a = b;
        this.b = le7Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        le7 le7Var = this.b;
        switch (b) {
            case 0:
                le7Var.i = (sd7) obj;
                break;
            default:
                sd7 sd7Var = (sd7) obj;
                le7Var.h.onNext(sd7Var);
                if (sd7Var.g != 1) {
                    le7Var.i();
                }
                break;
        }
    }
}
