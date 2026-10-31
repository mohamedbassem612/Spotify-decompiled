package com.spotify.mobius.runners;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p.rue0;
import p.vue0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class ExecutorServiceWorkRunner implements WorkRunner {
    public static final rue0 c = vue0.b(ExecutorServiceWorkRunner.class);
    public final ExecutorService a;
    public final ReentrantLock b = new ReentrantLock();

    public ExecutorServiceWorkRunner(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ExecutorService executorService = this.a;
        rue0 rue0Var = c;
        ReentrantLock reentrantLock = this.b;
        try {
            reentrantLock.lock();
            try {
                List<Runnable> listShutdownNow = executorService.shutdownNow();
                if (!listShutdownNow.isEmpty()) {
                    rue0Var.m(Integer.valueOf(listShutdownNow.size()), "Disposing ExecutorServiceWorkRunner with {} outstanding tasks.");
                }
                reentrantLock.unlock();
                if (executorService.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    return;
                }
                rue0Var.e("ExecutorService shutdown timed out; there are still tasks executing");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (InterruptedException e) {
            rue0Var.k("Timeout when disposing work runner", e);
        }
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        ExecutorService executorService = this.a;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            if (!executorService.isTerminated() && !executorService.isShutdown()) {
                executorService.submit(runnable);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
