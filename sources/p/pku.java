package p;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pku implements qku {
    public final ScheduledFuture a;

    public pku(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
