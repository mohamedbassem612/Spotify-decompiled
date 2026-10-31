package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ks61 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ms61 b;

    public /* synthetic */ ks61(ms61 ms61Var, byte b) {
        this.a = b;
        this.b = ms61Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ms61 ms61Var = this.b;
        switch (b) {
            case 0:
                ms61Var.j();
                break;
            default:
                ms61Var.h((Throwable) obj);
                break;
        }
    }
}
