package p;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyr extends gb00 implements Runnable {
    public static final kyr Y;
    public static final long Z;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        kyr kyrVar = new kyr();
        Y = kyrVar;
        ab00.U(kyrVar);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        Z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // p.gb00
    public final void a0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.a0(runnable);
    }

    @Override // p.gb00
    public final Thread d0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(kyr.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p.k4t
    public final qku f(long j, Runnable runnable, o8n o8nVar) {
        long jI = bwp0.i(j);
        if (jI >= 4611686018427387903L) {
            return keo0.a;
        }
        long jNanoTime = System.nanoTime();
        db00 db00Var = new db00(runnable, jI + jNanoTime);
        g0(jNanoTime, db00Var);
        return db00Var;
    }

    @Override // p.gb00
    public final void f0(long j, eb00 eb00Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void h0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = avg.a;
            unsafe.putObjectVolatile(this, gb00.X, (Object) null);
            unsafe.putObjectVolatile(this, gb00.i, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        jge1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    h0();
                    if (e0()) {
                        return;
                    }
                    d0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jY = Y();
                    if (jY == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = Z + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            h0();
                            if (e0()) {
                                return;
                            }
                            d0();
                            return;
                        }
                        if (jY > j2) {
                            jY = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jY > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            h0();
                            if (e0()) {
                                return;
                            }
                            d0();
                            return;
                        }
                        LockSupport.parkNanos(this, jY);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            h0();
            if (!e0()) {
                d0();
            }
            throw th;
        }
    }

    @Override // p.gb00
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final String toString() {
        return "DefaultExecutor";
    }
}
