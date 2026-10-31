package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h5b1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n5b1 b;

    public /* synthetic */ h5b1(n5b1 n5b1Var, byte b) {
        this.a = b;
        this.b = n5b1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        n5b1 n5b1Var = this.b;
        switch (b) {
            case 0:
                n5b1Var.h((Throwable) obj);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                if (!(th instanceof TimeoutException)) {
                    n57.g("Failed to connect to EIP", th);
                }
                n5b1Var.h(th);
                break;
            default:
                n5b1Var.f.g((String) obj);
                break;
        }
    }
}
