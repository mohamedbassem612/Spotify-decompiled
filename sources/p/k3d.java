package p;

import java.util.LinkedHashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k3d implements Executor {
    public static final x2o1 c = new x2o1((byte) 2);
    public final Object a = new Object();
    public ThreadPoolExecutor b;

    public k3d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) c);
        threadPoolExecutor.setRejectedExecutionHandler(new j3d());
        this.b = threadPoolExecutor;
    }

    public final void a(e1d e1dVar) {
        ThreadPoolExecutor threadPoolExecutor;
        e1dVar.getClass();
        synchronized (this.a) {
            try {
                if (this.b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new j3d());
                    this.b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, new LinkedHashSet(e1dVar.f).size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            this.b.execute(runnable);
        }
    }
}
