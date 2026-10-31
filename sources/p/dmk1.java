package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dmk1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tp7 b;

    public /* synthetic */ dmk1(tp7 tp7Var, byte b) {
        this.a = b;
        this.b = tp7Var;
    }

    public final void run() {
        byte b = this.a;
        tp7 tp7Var = this.b;
        switch (b) {
            case 0:
                ((AtomicBoolean) tp7Var.j).set(false);
                break;
            default:
                ((AtomicBoolean) tp7Var.j).set(true);
                break;
        }
    }
}
