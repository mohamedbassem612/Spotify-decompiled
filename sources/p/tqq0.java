package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tqq0 {
    public final Flowable a;
    public final p2p0 b;
    public final Scheduler c;
    public final rku d = new rku();

    public tqq0(Flowable flowable, p2p0 p2p0Var, Scheduler scheduler) {
        this.a = flowable;
        this.b = p2p0Var;
        this.c = scheduler;
    }

    public final void a() {
        this.d.b(this.a.t(Functions.a).L(this.c).subscribe(new ixp0(this.b, (byte) 2)));
    }

    public final void b() {
        this.d.a();
    }
}
