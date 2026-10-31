package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class soy0 extends ymd0 {
    public final Flowable Y;
    public final AtomicReference Z = new AtomicReference();

    public soy0(Flowable flowable) {
        this.Y = flowable;
    }

    @Override // p.ymd0
    public final void h() {
        roy0 roy0Var = new roy0(this);
        this.Z.set(roy0Var);
        this.Y.subscribe(roy0Var);
    }

    @Override // p.ymd0
    public final void i() {
        pnc1 pnc1Var;
        roy0 roy0Var = (roy0) this.Z.getAndSet(null);
        if (roy0Var == null || (pnc1Var = (pnc1) roy0Var.get()) == null) {
            return;
        }
        pnc1Var.cancel();
    }
}
