package p;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class gve1 {
    public static final fve1 d = new fve1();
    public boolean a;
    public long b;
    public long c;

    public gve1 a() {
        this.a = false;
        return this;
    }

    public gve1 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        eg.m("No deadline");
        return 0L;
    }

    public gve1 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public gve1 g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        hhg1.f(l1d.l(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
