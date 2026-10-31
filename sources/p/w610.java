package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class w610 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y610 b;
    public final /* synthetic */ AtomicBoolean c;

    public /* synthetic */ w610(y610 y610Var, AtomicBoolean atomicBoolean, byte b) {
        this.a = b;
        this.b = y610Var;
        this.c = atomicBoolean;
    }

    public final void run() {
        byte b = this.a;
        AtomicBoolean atomicBoolean = this.c;
        y610 y610Var = this.b;
        switch (b) {
            case 0:
                y610Var.b(atomicBoolean);
                break;
            case 1:
                y610Var.b(atomicBoolean);
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    y610Var.o.g(ozm0.a);
                    v7v v7vVar = y610Var.u;
                    if (v7vVar != null) {
                        v7vVar.invoke();
                    }
                    break;
                }
                break;
        }
    }
}
