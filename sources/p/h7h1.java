package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h7h1 implements dwo {
    public final kly0 a;
    public final rku b;
    public boolean c;

    public h7h1(kly0 kly0Var, Observable observable, Scheduler scheduler) {
        this.a = kly0Var;
        rku rkuVar = new rku();
        this.b = rkuVar;
        this.c = true;
        rkuVar.b(observable.observeOn(scheduler).subscribe((Consumer) new z2a1(this, (byte) 22)));
    }

    @Override // p.dwo
    public final void shutdown() {
        this.b.a();
    }
}
