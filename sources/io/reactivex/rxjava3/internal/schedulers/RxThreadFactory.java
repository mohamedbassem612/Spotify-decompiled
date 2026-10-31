package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public static final class RxCustomThread extends Thread {
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread rxCustomThread = this.c ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.b);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return l1d.n(this.a, "]", new StringBuilder("RxThreadFactory["));
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }
}
