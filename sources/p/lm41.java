package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lm41 extends q8n implements k4t {
    public final Scheduler c;

    public lm41(Scheduler scheduler) {
        this.c = scheduler;
    }

    @Override // p.k4t
    public final void c(long j, ohd ohdVar) {
        ohdVar.n(new waq0(this.c.d(new zyh0(ohdVar, this, (byte) 25), j, TimeUnit.MILLISECONDS), (byte) 11));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lm41) && ((lm41) obj).c == this.c;
    }

    @Override // p.k4t
    public final qku f(long j, Runnable runnable, o8n o8nVar) {
        return new km41(this.c.d(runnable, j, TimeUnit.MILLISECONDS));
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        this.c.c(runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // p.q8n
    public final String toString() {
        return this.c.toString();
    }
}
