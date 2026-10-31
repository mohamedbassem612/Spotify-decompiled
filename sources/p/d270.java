package p;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d270 implements c291 {
    public final boolean a;
    public final nac b = new nac();
    public boolean c;
    public final /* synthetic */ g270 d;

    public d270(g270 g270Var, boolean z) {
        this.d = g270Var;
        this.a = z;
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) {
        TimeZone timeZone = z4n1.a;
        nac nacVar2 = this.b;
        nacVar2.B0(nacVar, j);
        while (nacVar2.b >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        g270 g270Var = this.d;
        synchronized (g270Var) {
            g270Var.X.i();
            while (g270Var.d >= g270Var.e && !this.a && !this.c && g270Var.f() == 0) {
                try {
                    try {
                        g270Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    g270Var.X.l();
                    throw th;
                }
            }
            g270Var.X.l();
            g270Var.b();
            jMin = Math.min(g270Var.e - g270Var.d, this.b.b);
            g270Var.d += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.X.i();
        try {
            g270 g270Var2 = this.d;
            g270Var2.b.g(g270Var2.a, z2, this.b, jMin);
        } finally {
            this.d.X.l();
        }
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g270 g270Var = this.d;
        TimeZone timeZone = z4n1.a;
        synchronized (g270Var) {
            if (this.c) {
                return;
            }
            boolean z = g270Var.f() == 0;
            g270 g270Var2 = this.d;
            if (!g270Var2.i.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        a(true);
                    }
                } else if (z) {
                    g270Var2.b.g(g270Var2.a, true, null, 0L);
                }
            }
            g270 g270Var3 = this.d;
            synchronized (g270Var3) {
                this.c = true;
                g270Var3.notifyAll();
            }
            this.d.b.flush();
            this.d.a();
        }
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() {
        g270 g270Var = this.d;
        TimeZone timeZone = z4n1.a;
        synchronized (g270Var) {
            g270Var.b();
        }
        while (this.b.b > 0) {
            a(false);
            this.d.b.flush();
        }
    }

    @Override // p.c291
    public final gve1 l() {
        return this.d.X;
    }
}
