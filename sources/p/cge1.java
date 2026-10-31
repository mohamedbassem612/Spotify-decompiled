package p;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cge1 implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicLong c;
    public final /* synthetic */ Boolean d;

    public cge1(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.b;
        if (str != null) {
            AtomicLong atomicLong = this.c;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(lf8.a(str, new Object[]{Long.valueOf(atomicLong.getAndIncrement())}));
        }
        Boolean bool = this.d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
