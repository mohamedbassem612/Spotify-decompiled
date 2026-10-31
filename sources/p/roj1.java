package p;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class roj1 {
    public static final long h;
    public final boolean a;
    public final ExecutorService b;
    public final Future c;
    public final poj1 d;
    public final Object e = new Object();
    public final ArrayDeque f = new ArrayDeque();
    public boolean g;

    static {
        h = zoi1.S() ? 5000L : 500L;
    }

    public roj1(ExecutorService executorService, boolean z, poj1 poj1Var) {
        this.b = executorService;
        this.c = executorService.submit(new noj1());
        this.a = z;
        this.d = poj1Var;
    }

    public final void a() throws InterruptedException {
        synchronized (this.e) {
            this.g = true;
            this.f.clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.submit((Runnable) new jv5(this, false, new ace(this, countDownLatch, (byte) 6), (byte) 1));
        countDownLatch.await();
    }

    public final void b(Exception exc) {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.d.a(VideoFrameProcessingException.a(-9223372036854775807L, exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(qoj1 qoj1Var) {
        if (d()) {
            try {
                qoj1Var.run();
                return;
            } catch (Exception e) {
                b(e);
                return;
            }
        }
        try {
            this.b.submit(new qub1(this, qoj1Var, (byte) 6)).get(h, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            b(e2);
        }
    }

    public final boolean d() throws InterruptedException {
        try {
            return Thread.currentThread() == ((Thread) this.c.get(h, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            b(e2);
            return false;
        }
    }

    public final void e(qoj1 qoj1Var) {
        dm5.y(!d());
        synchronized (this.e) {
            this.g = true;
            this.f.clear();
        }
        this.b.submit((Runnable) new jv5(this, false, qoj1Var, (byte) 1));
        if (this.a) {
            this.b.shutdown();
            if (this.b.awaitTermination(h, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.d.a(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public final void f(qoj1 qoj1Var, boolean z) {
        synchronized (this.e) {
            if (this.g && z) {
                return;
            }
            try {
                this.b.submit((Runnable) new jv5(this, z, qoj1Var, (byte) 1));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                b(e);
            }
        }
    }

    public final void g(qoj1 qoj1Var) {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                this.f.add(qoj1Var);
                f(new ooj1(), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        try {
            dm5.y(d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            b(e);
        }
    }
}
