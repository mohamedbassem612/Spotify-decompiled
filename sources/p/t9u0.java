package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t9u0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r0s0 b;

    public /* synthetic */ t9u0(r0s0 r0s0Var, byte b) {
        this.a = b;
        this.b = r0s0Var;
    }

    public final void run() {
        byte b = this.a;
        r0s0 r0s0Var = this.b;
        switch (b) {
            case 0:
                ((AtomicBoolean) r0s0Var.d).set(true);
                break;
            default:
                ((AtomicBoolean) r0s0Var.d).set(false);
                break;
        }
    }
}
