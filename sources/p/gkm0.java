package p;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gkm0 extends dkm0 implements dmd0 {
    public final ScheduledExecutorService b;

    public gkm0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableY = nwg1.y(runnable, (Object) null);
        return new ekm0(runnableY, this.b.schedule(runnableY, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable fkm0Var = new fkm0(runnable);
        return new ekm0(fkm0Var, this.b.scheduleAtFixedRate(fkm0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable fkm0Var = new fkm0(runnable);
        return new ekm0(fkm0Var, this.b.scheduleWithFixedDelay(fkm0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Runnable runnableZ = nwg1.z(callable);
        return new ekm0(runnableZ, this.b.schedule(runnableZ, j, timeUnit));
    }
}
