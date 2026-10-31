package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yha0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aia0 b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ yha0(aia0 aia0Var, Throwable th, byte b) {
        this.a = b;
        this.b = aia0Var;
        this.c = th;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Throwable th = this.c;
        aia0 aia0Var = this.b;
        switch (b) {
            case 0:
                if (!(((tal) obj) instanceof qal)) {
                    aia0Var.c("Connection failed to initialize", th);
                } else {
                    aia0Var.d();
                }
                break;
            default:
                aia0Var.c("Connection failed to initialize", th);
                break;
        }
    }
}
