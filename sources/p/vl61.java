package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vl61 implements dwo {
    public final q7b1 a;
    public final Scheduler b;
    public final x8c0 c;
    public final Disposable d;
    public Disposable e;
    public final k5g f = new k5g(this, (byte) 3);

    public vl61(q7b1 q7b1Var, Scheduler scheduler, x8c0 x8c0Var) {
        this.a = q7b1Var;
        this.b = scheduler;
        this.c = x8c0Var;
        this.d = q7b1Var.a().subscribe();
        scheduler.c(new g54(this, (byte) 14));
    }

    public final void shutdown() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.e;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        this.b.c(new xfz0(this, (byte) 13));
    }
}
