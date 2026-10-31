package p;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fz31 implements RunnableFuture {
    public final hsk a = new hsk();
    public final hsk b = new hsk();
    public final Object c = new Object();
    public Exception d;
    public Object e;
    public Thread f;
    public boolean g;

    public final void a() {
        this.b.b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.c) {
            try {
                if (!this.g && !this.b.e()) {
                    this.g = true;
                    d();
                    Thread thread = this.f;
                    if (thread == null) {
                        this.a.f();
                        this.b.f();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object e();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        hsk hskVar = this.b;
        synchronized (hskVar) {
            try {
                if (jConvert <= 0) {
                    z = hskVar.b;
                } else {
                    hskVar.a.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = jConvert + jElapsedRealtime;
                    if (j2 < jElapsedRealtime) {
                        hskVar.a();
                    } else {
                        while (!hskVar.b && jElapsedRealtime < j2) {
                            hskVar.a.getClass();
                            hskVar.wait(j2 - jElapsedRealtime);
                            hskVar.a.getClass();
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                    }
                    z = hskVar.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            throw new TimeoutException();
        }
        if (this.g) {
            throw new CancellationException();
        }
        Exception exc = this.d;
        if (exc == null) {
            return this.e;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                if (this.g) {
                    return;
                }
                this.f = Thread.currentThread();
                this.a.f();
                try {
                    try {
                        this.e = e();
                        synchronized (this.c) {
                            this.b.f();
                            this.f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.c) {
                            this.b.f();
                            this.f = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.d = e;
                    synchronized (this.c) {
                        this.b.f();
                        this.f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.b.a();
        if (!this.g) {
            Exception exc = this.d;
            if (exc == null) {
                return this.e;
            }
            throw new ExecutionException(exc);
        }
        throw new CancellationException();
    }
}
