package com.spotify.mobius.rx3;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.WorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class SchedulerWorkRunner implements WorkRunner {
    public final Scheduler.Worker a;
    public final ReentrantLock b = new ReentrantLock();

    public SchedulerWorkRunner(Scheduler scheduler) {
        Preconditions.b(scheduler);
        this.a = scheduler.b();
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.a.dispose();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.a.a(runnable);
        } finally {
            reentrantLock.unlock();
        }
    }
}
