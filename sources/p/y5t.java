package p;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y5t extends t9 implements ScheduledFuture {
    public final ScheduledFuture h;

    public y5t(x5t x5tVar) {
        this.h = x5tVar.a(new h9n(this, (byte) 21));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    public final void d() {
        ScheduledFuture scheduledFuture = this.h;
        Object obj = ((t9) this).a;
        scheduledFuture.cancel((obj instanceof l9) && ((l9) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }
}
