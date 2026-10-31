package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j8h1 implements dwo {
    public final rfb0 a;
    public final sfb0 b;
    public final rku c;

    public j8h1(rfb0 rfb0Var, Flowable flowable, sfb0 sfb0Var, Scheduler scheduler) {
        this.a = rfb0Var;
        this.b = sfb0Var;
        rku rkuVar = new rku();
        this.c = rkuVar;
        rkuVar.b(flowable.L(scheduler).subscribe((Consumer) new z2a1(this, (byte) 23)));
    }

    @Override // p.dwo
    public final void shutdown() {
        this.c.a();
        this.b.a = null;
        this.a.a = null;
    }
}
