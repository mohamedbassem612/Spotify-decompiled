package p;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h270 implements Closeable {
    public static final Logger f = Logger.getLogger(o170.class.getName());
    public final df01 a;
    public final nac b;
    public int c;
    public boolean d;
    public final wy60 e;

    public h270(df01 df01Var) {
        this.a = df01Var;
        nac nacVar = new nac();
        this.b = nacVar;
        this.c = 16384;
        this.e = new wy60(nacVar);
    }

    public final void a(im61 im61Var) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = im61Var.a;
                if ((i2 & 32) != 0) {
                    i = im61Var.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? im61Var.b[1] : -1) != -1) {
                    wy60 wy60Var = this.e;
                    int iMin = Math.min((i2 & 2) != 0 ? im61Var.b[1] : -1, 16384);
                    int i3 = wy60Var.d;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            wy60Var.b = Math.min(wy60Var.b, iMin);
                        }
                        wy60Var.c = true;
                        wy60Var.d = iMin;
                        int i4 = wy60Var.h;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                f46.h0(wy60Var.e, null);
                                wy60Var.f = wy60Var.e.length - 1;
                                wy60Var.g = 0;
                                wy60Var.h = 0;
                            } else {
                                wy60Var.a(i4 - iMin);
                            }
                        }
                    }
                }
                d(0, 0, 4, 1);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z, int i, nac nacVar, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            d(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                df01 df01Var = this.a;
                nacVar.getClass();
                df01Var.B0(nacVar, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.a.close();
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(o170.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.c) {
            k220.d(this.c, i2, ": ", "FRAME_SIZE_ERROR length > ");
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            hhg1.f(f4i1.c(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = w4n1.a;
        df01 df01Var = this.a;
        df01Var.writeByte((i2 >>> 16) & 255);
        df01Var.writeByte((i2 >>> 8) & 255);
        df01Var.writeByte(i2 & 255);
        df01Var.writeByte(i3 & 255);
        df01Var.writeByte(i4 & 255);
        df01Var.c(i & Integer.MAX_VALUE);
    }

    public final void e(int i, byte[] bArr, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (gvg.a(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            d(0, bArr.length + 8, 7, 0);
            this.a.c(i);
            this.a.c(gvg.a(i2));
            if (bArr.length != 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        }
    }

    public final void f(int i, ArrayList arrayList, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long jMin = Math.min(this.c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            d(i, (int) jMin, 1, i2);
            this.a.B0(this.b, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.c, j2);
                    j2 -= jMin2;
                    d(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.a.B0(this.b, jMin2);
                }
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public final void g(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            d(0, 8, 6, z ? 1 : 0);
            this.a.c(i);
            this.a.c(i2);
            this.a.flush();
        }
    }

    public final void h(int i, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (gvg.a(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            d(i, 4, 3, 0);
            this.a.c(gvg.a(i2));
            this.a.flush();
        }
    }

    public final void i(int i, long j) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o170.c(i, 4, j, false));
                }
                d(i, 4, 8, 0);
                this.a.c((int) j);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
