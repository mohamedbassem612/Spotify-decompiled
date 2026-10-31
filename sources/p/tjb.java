package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tjb implements f961 {
    public final b3p a;
    public final vku b;
    public q59 c;

    static {
        new sjb((byte) 0);
    }

    public tjb(b3p b3pVar, Observable observable, Scheduler scheduler) {
        this.a = b3pVar;
        vku vkuVar = new vku();
        this.b = vkuVar;
        vkuVar.a(observable.observeOn(scheduler).subscribe((Consumer) new mba(this, (byte) 8)));
    }

    @Override // p.dwo
    public final void shutdown() {
        this.b.c();
        q59 q59Var = this.c;
        if (q59Var != null) {
            q59Var.l().L();
        }
        this.c = null;
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
