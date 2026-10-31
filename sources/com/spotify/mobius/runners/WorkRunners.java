package com.spotify.mobius.runners;

import com.spotify.mobius.internal_util.Preconditions;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class WorkRunners {
    public static final MyThreadFactory a = new MyThreadFactory(0);

    public static ExecutorServiceWorkRunner a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(a);
        Preconditions.b(executorServiceNewSingleThreadExecutor);
        return new ExecutorServiceWorkRunner(executorServiceNewSingleThreadExecutor);
    }

    public static class MyThreadFactory implements ThreadFactory {
        public static final AtomicLong a = new AtomicLong(0);

        private MyThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
            Preconditions.b(runnable);
            Thread threadNewThread = threadFactoryDefaultThreadFactory.newThread(runnable);
            Locale locale = Locale.ENGLISH;
            threadNewThread.setName("mobius-thread-" + a.incrementAndGet());
            return threadNewThread;
        }

        public /* synthetic */ MyThreadFactory(int i) {
            this();
        }
    }
}
