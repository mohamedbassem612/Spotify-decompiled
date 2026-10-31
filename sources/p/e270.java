package p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e270 implements fka1 {
    public final long a;
    public boolean b;
    public final nac c = new nac();
    public final nac d = new nac();
    public boolean e;
    public final /* synthetic */ g270 f;

    public e270(g270 g270Var, long j, boolean z) {
        this.f = g270Var;
        this.a = j;
        this.b = z;
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long j2;
        long jO0;
        long j3 = 0;
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            g270 g270Var = this.f;
            synchronized (g270Var) {
                g270Var.b.getClass();
                d270 d270Var = g270Var.i;
                z = true;
                boolean z2 = d270Var.c || d270Var.a;
                if (z2) {
                    g270Var.t.i();
                }
                try {
                    if (g270Var.f() == 0 || this.b) {
                        streamResetException = null;
                    } else {
                        streamResetException = g270Var.Z;
                        if (streamResetException == null) {
                            int iF = g270Var.f();
                            l1d.b(iF);
                            streamResetException = new StreamResetException(iF);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    nac nacVar2 = this.d;
                    long j4 = nacVar2.b;
                    if (j4 > j3) {
                        jO0 = nacVar2.O0(nacVar, Math.min(j, j4));
                        qql1.b(g270Var.c, jO0, 0L, 2);
                        long jA = g270Var.c.a();
                        if (streamResetException == null) {
                            j2 = j3;
                            if (jA >= g270Var.b.R0.a() / 2) {
                                g270Var.b.i(g270Var.a, jA);
                                qql1.b(g270Var.c, 0L, jA, 1);
                            }
                        } else {
                            j2 = j3;
                        }
                        z = false;
                    } else {
                        j2 = j3;
                        if (this.b || streamResetException != null) {
                            z = false;
                        } else {
                            try {
                                g270Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jO0 = -1;
                    }
                    if (z2) {
                        g270Var.t.l();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        g270Var.t.l();
                    }
                    throw th;
                }
            }
            this.f.b.Q0.getClass();
            if (!z) {
                if (jO0 != -1) {
                    return jO0;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j3 = j2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        g270 g270Var = this.f;
        synchronized (g270Var) {
            this.e = true;
            nac nacVar = this.d;
            j = nacVar.b;
            nacVar.a();
            g270Var.notifyAll();
        }
        if (j > 0) {
            g270 g270Var2 = this.f;
            TimeZone timeZone = z4n1.a;
            g270Var2.b.f(j);
        }
        this.f.a();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.f.t;
    }
}
