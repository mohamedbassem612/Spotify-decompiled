package p;

import com.spotify.playbacknative.AudioDriver;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z170 implements Closeable {
    public static final im61 a1;
    public long N0;
    public long O0;
    public long P0;
    public final xr20 Q0;
    public final im61 R0;
    public im61 S0;
    public final qql1 T0;
    public long U0;
    public long V0;
    public final uo5 W0;
    public final rtw0 X;
    public final h270 X0;
    public long Y;
    public final y170 Y0;
    public long Z;
    public final LinkedHashSet Z0;
    public final x170 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final isd1 g;
    public final hsd1 h;
    public final hsd1 i;
    public final hsd1 t;

    static {
        im61 im61Var = new im61();
        im61Var.b(4, AudioDriver.SPOTIFY_MAX_VOLUME);
        im61Var.b(5, 16384);
        a1 = im61Var;
    }

    public z170(v170 v170Var) {
        this.a = (x170) v170Var.e;
        String str = (String) v170Var.d;
        if (str == null) {
            u890.C("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        isd1 isd1Var = (isd1) v170Var.b;
        this.g = isd1Var;
        hsd1 hsd1VarD = isd1Var.d();
        this.h = hsd1VarD;
        this.i = isd1Var.d();
        this.t = isd1Var.d();
        this.X = rtw0.c;
        this.Q0 = (xr20) v170Var.f;
        im61 im61Var = new im61();
        im61Var.b(4, 16777216);
        this.R0 = im61Var;
        im61 im61Var2 = a1;
        this.S0 = im61Var2;
        this.T0 = new qql1(0);
        this.V0 = im61Var2.a();
        uo5 uo5Var = (uo5) v170Var.c;
        if (uo5Var == null) {
            u890.C("socket");
            throw null;
        }
        this.W0 = uo5Var;
        this.X0 = new h270((df01) uo5Var.d);
        this.Y0 = new y170(this, new c270((ff01) uo5Var.c));
        this.Z0 = new LinkedHashSet();
        int i = v170Var.a;
        if (i != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            hsd1VarD.d(new gsd1(str.concat(" ping"), new Function0() { // from class: p.p170
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    z170 z170Var = this.a;
                    long j = nanos;
                    synchronized (z170Var) {
                        long j2 = z170Var.Z;
                        long j3 = z170Var.Y;
                        if (j2 < j3) {
                            z = true;
                        } else {
                            z170Var.Y = j3 + 1;
                            z = false;
                        }
                    }
                    if (z) {
                        z170Var.a(2, 2, null);
                        j = -1;
                    } else {
                        try {
                            z170Var.X0.g(1, 0, false);
                        } catch (IOException e) {
                            z170Var.a(2, 2, e);
                        }
                    }
                    return Long.valueOf(j);
                }
            }), nanos);
        }
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        TimeZone timeZone = z4n1.a;
        try {
            e(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new g270[0]);
                this.b.clear();
            }
        }
        g270[] g270VarArr = (g270[]) array;
        if (g270VarArr != null) {
            for (g270 g270Var : g270VarArr) {
                try {
                    g270Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.X0.close();
        } catch (IOException unused3) {
        }
        try {
            this.W0.cancel();
        } catch (IOException unused4) {
        }
        this.h.g();
        this.i.g();
        this.t.g();
    }

    public final g270 c(int i) {
        g270 g270Var;
        synchronized (this) {
            g270Var = (g270) this.b.get(Integer.valueOf(i));
        }
        return g270Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final g270 d(int i) {
        g270 g270Var;
        synchronized (this) {
            g270Var = (g270) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return g270Var;
    }

    public final void e(int i) {
        synchronized (this.X0) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.X0.e(this.d, w4n1.a, i);
            }
        }
    }

    public final void f(long j) {
        synchronized (this) {
            try {
                qql1.b(this.T0, j, 0L, 2);
                long jA = this.T0.a();
                if (jA >= this.R0.a() / 2) {
                    i(0, jA);
                    qql1.b(this.T0, 0L, jA, 1);
                }
                this.Q0.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        this.X0.flush();
    }

    public final void g(int i, boolean z, nac nacVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.X0.c(z, i, nacVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.U0;
                            j3 = this.V0;
                            if (j2 >= j3) {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.X0.c);
                j4 = iMin;
                this.U0 += j4;
            }
            j -= j4;
            this.X0.c(z && j == 0, i, nacVar, iMin);
        }
    }

    public final void h(int i, int i2) {
        hsd1.c(this.h, this.c + '[' + i + "] writeSynReset", 0L, new r170(this, i, i2, (byte) 0), 6);
    }

    public final void i(int i, long j) {
        hsd1.c(this.h, this.c + '[' + i + "] windowUpdate", 0L, new q170(this, i, j), 6);
    }
}
