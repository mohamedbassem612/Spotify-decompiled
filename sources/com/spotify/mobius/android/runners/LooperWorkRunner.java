package com.spotify.mobius.android.runners;

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobius.runners.WorkRunner;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class LooperWorkRunner implements WorkRunner {
    public final Handler a;
    public boolean b;
    public final ReentrantLock c = new ReentrantLock();

    public LooperWorkRunner(Looper looper) {
        this.a = new Handler(looper);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.a.removeCallbacksAndMessages(null);
            this.b = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.a.post(runnable);
        } finally {
            reentrantLock.unlock();
        }
    }
}
