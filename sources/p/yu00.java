package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yu00 implements Action {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ nif1 b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ AtomicBoolean d;
    public final /* synthetic */ kj41 e;

    public yu00(AtomicBoolean atomicBoolean, nif1 nif1Var, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean2, kj41 kj41Var) {
        this.a = atomicBoolean;
        this.b = nif1Var;
        this.c = atomicInteger;
        this.d = atomicBoolean2;
        this.e = kj41Var;
    }

    public final void run() {
        boolean z = this.a.get();
        nif1 nif1Var = this.b;
        if (z) {
            nif1Var.e("await_response_" + (this.c.get() + 1));
        }
        if (!this.d.get()) {
            nif1Var.e("await_final_response");
        }
        nif1Var.stop();
        this.e.cancel();
    }
}
