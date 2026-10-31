package p;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gds implements syp0 {
    public long X;
    public long Y;
    public final ryp0 a;
    public final long b;
    public final long c;
    public final aec1 d;
    public byte e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long t;

    public gds(aec1 aec1Var, long j, long j2, long j3, long j4, boolean z) {
        dm5.m(j >= 0 && j2 > j);
        this.d = aec1Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = (byte) 4;
        } else {
            this.e = (byte) 0;
        }
        this.a = new ryp0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public final long f(fc10 fc10Var) throws ParserException, EOFException {
        long j;
        long j2;
        long jK;
        byte b = this.e;
        long j3 = this.c;
        ryp0 ryp0Var = this.a;
        if (b == 0) {
            long position = fc10Var.getPosition();
            this.g = position;
            this.e = (byte) 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (b != 1) {
            if (b == 2) {
                j = 2;
                if (this.i == this.t) {
                    jK = -1;
                    j2 = -1;
                } else {
                    long position2 = fc10Var.getPosition();
                    if (ryp0Var.d(fc10Var, this.t)) {
                        ryp0Var.a(fc10Var, false);
                        fc10Var.f();
                        long j5 = this.h;
                        long j6 = ryp0Var.b;
                        long j7 = j5 - j6;
                        int i = ryp0Var.d + ryp0Var.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.t = position2;
                                this.Y = j6;
                            } else {
                                this.i = fc10Var.getPosition() + ((long) i);
                                this.X = ryp0Var.b;
                            }
                            long j8 = this.t;
                            long j9 = this.i;
                            if (j8 - j9 < 100000) {
                                this.t = j9;
                                j2 = -1;
                                jK = j9;
                            } else {
                                long position3 = fc10Var.getPosition() - (((long) i) * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.t;
                                long j11 = this.i;
                                j2 = -1;
                                jK = zoi1.k((((j10 - j11) * j7) / (this.Y - this.X)) + position3, j11, j10 - 1);
                            }
                        } else {
                            jK = -1;
                            j2 = -1;
                        }
                    } else {
                        jK = this.i;
                        if (jK == position2) {
                            k220.i("No ogg page can be found.");
                            return 0L;
                        }
                        j2 = -1;
                    }
                }
                if (jK != j2) {
                    return jK;
                }
                this.e = (byte) 3;
            } else {
                if (b != 3) {
                    if (b == 4) {
                        return -1L;
                    }
                    bhn0.w();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                ryp0Var.c(fc10Var);
                ryp0Var.a(fc10Var, false);
                if (ryp0Var.b > this.h) {
                    fc10Var.f();
                    this.e = (byte) 4;
                    return -(this.X + j);
                }
                fc10Var.u(ryp0Var.d + ryp0Var.e);
                this.i = fc10Var.getPosition();
                this.X = ryp0Var.b;
            }
        }
        ryp0Var.b();
        if (!ryp0Var.d(fc10Var, -1L)) {
            eg.l();
            return 0;
        }
        ryp0Var.a(fc10Var, false);
        fc10Var.u(ryp0Var.d + ryp0Var.e);
        long j12 = ryp0Var.b;
        while ((ryp0Var.a & 4) != 4 && ryp0Var.d(fc10Var, -1L) && fc10Var.getPosition() < j3 && ryp0Var.a(fc10Var, true) && jto1.F(fc10Var, ryp0Var.d + ryp0Var.e)) {
            j12 = ryp0Var.b;
        }
        this.f = j12;
        this.e = (byte) 4;
        return this.g;
    }

    public final fn51 i() {
        if (this.f != 0) {
            return new fds(this);
        }
        return null;
    }

    public final void j(long j) {
        this.h = zoi1.k(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.i = this.b;
        this.t = this.c;
        this.X = 0L;
        this.Y = this.f;
    }
}
