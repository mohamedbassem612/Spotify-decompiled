package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mqi0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nqi0 b;

    public /* synthetic */ mqi0(nqi0 nqi0Var, byte b) {
        this.a = b;
        this.b = nqi0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        nqi0 nqi0Var = this.b;
        switch (b) {
            case 0:
                nqi0Var.i = (String) ((Optional) obj).orElse(null);
                break;
            case 1:
                nqi0Var.h = (lqi0) obj;
                nqi0Var.i();
                break;
            default:
                nqi0Var.h((Throwable) obj);
                break;
        }
    }
}
