package p;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hm00 extends gm00 implements k4t {
    public final Executor c;

    public hm00(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = bsk.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = bsk.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p.gm00
    public final Executor N() {
        return this.c;
    }

    @Override // p.k4t
    public final void c(long j, ohd ohdVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            jyh0 jyh0Var = new jyh0(this, ohdVar, (byte) 18);
            o8n o8nVar = ohdVar.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule((Runnable) jyh0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                op71.m(o8nVar, lgo1.b("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            jzn1.v(ohdVar, new agd(scheduledFutureSchedule, (byte) 0));
        } else {
            kyr.Y.c(j, ohdVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hm00) && ((hm00) obj).c == this.c;
    }

    @Override // p.k4t
    public final qku f(long j, Runnable runnable, o8n o8nVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                op71.m(o8nVar, lgo1.b("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new pku(scheduledFutureSchedule) : kyr.Y.f(j, runnable, o8nVar);
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            op71.m(o8nVar, lgo1.b("The task was rejected", e));
            fns fnsVar = igu.a;
            b3s.c.h(o8nVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // p.q8n
    public final String toString() {
        return this.c.toString();
    }
}
