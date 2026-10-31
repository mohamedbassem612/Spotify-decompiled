package p;

import com.comscore.streaming.WindowState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rfa1 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final qfa1 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f126p;
    public double q;

    public rfa1(int i, int i2, float f, float f2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / WindowState.NORMAL;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        this.i = z ? new pfa1(this) : new wv71(this);
    }

    public final void a(int i, int i2) {
        qfa1 qfa1Var = this.i;
        qfa1Var.e(i2);
        Object objD = qfa1Var.d();
        int i3 = this.b;
        System.arraycopy(objD, i * i3, qfa1Var.l(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f;
        int i;
        double d;
        int i2;
        int iRound;
        int i3;
        int iRound2;
        int i4;
        int i5;
        long j;
        long j2;
        int i6 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i7 = this.a;
        int i8 = 1;
        qfa1 qfa1Var = this.i;
        int i9 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i10 = this.j;
            int i11 = this.h;
            if (i10 >= i11) {
                int i12 = 0;
                while (true) {
                    int i13 = this.o;
                    if (i13 > 0) {
                        int iMin = Math.min(i11, i13);
                        a(i12, iMin);
                        this.o -= iMin;
                        i12 += iMin;
                        f = f4;
                        d = d2;
                        i3 = i8;
                        i2 = i11;
                    } else {
                        int i14 = i7 > 4000 ? i7 / 4000 : i8;
                        int i15 = this.g;
                        int i16 = this.f;
                        if (i9 == i8 && i14 == i8) {
                            i = qfa1Var.c(i12, i16, i15);
                            f = f4;
                        } else {
                            qfa1Var.b(i12, i14);
                            f = f4;
                            int i17 = qfa1Var.i(i16 / i14, i15 / i14);
                            if (i14 != i8) {
                                int i18 = i17 * i14;
                                int i19 = i14 * 4;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                if (i20 >= i16) {
                                    i16 = i20;
                                }
                                if (i21 <= i15) {
                                    i15 = i21;
                                }
                                if (i9 == i8) {
                                    i = qfa1Var.c(i12, i16, i15);
                                } else {
                                    qfa1Var.b(i12, i8);
                                    i = qfa1Var.i(i16, i15);
                                }
                            } else {
                                i = i17;
                            }
                        }
                        int i22 = qfa1Var.f() ? this.f126p : i;
                        qfa1Var.k();
                        this.f126p = i;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d4 = (((double) i22) / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - ((double) iRound2);
                                qfa1Var = qfa1Var;
                            } else {
                                d = d2;
                                double d5 = (((2.0d - d) * ((double) i22)) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.o = iRound3;
                                this.q = d5 - ((double) iRound3);
                                iRound2 = i22;
                            }
                            qfa1Var.e(iRound2);
                            int i23 = i11;
                            int i24 = iRound2;
                            qfa1Var.g(i24, this.b, this.k, i12, i12 + i22);
                            this.k += i24;
                            i12 = i22 + i24 + i12;
                            i2 = i23;
                            i3 = i8;
                        } else {
                            d = d2;
                            int i25 = i8;
                            i2 = i11;
                            if (d < 0.5d) {
                                double d6 = ((((double) i22) * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.q = d6 - ((double) iRound);
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i22)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.o = iRound4;
                                this.q = d7 - ((double) iRound4);
                                iRound = i22;
                            }
                            int i26 = i22 + iRound;
                            qfa1Var.e(i26);
                            i3 = i25;
                            System.arraycopy(qfa1Var.d(), i12 * i9, qfa1Var.l(), this.k * i9, i22 * i9);
                            int i27 = i12;
                            qfa1Var.g(iRound, this.b, this.k + i22, i22 + i12, i27);
                            this.k += i26;
                            i12 = i27 + iRound;
                        }
                    }
                    if (i12 + i2 > i10) {
                        break;
                    }
                    i11 = i2;
                    f4 = f;
                    i8 = i3;
                    d2 = d;
                }
                int i28 = this.j - i12;
                System.arraycopy(qfa1Var.d(), i12 * i9, qfa1Var.d(), 0, i28 * i9);
                this.j = i28;
            }
            if (f != 1.0f || this.k == i6) {
            }
            long j3 = (long) (i7 / f);
            long j4 = i7;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i29 = this.k - i6;
            qfa1Var.o(i29);
            System.arraycopy(qfa1Var.l(), i6 * i9, qfa1Var.m(), this.l * i9, i29 * i9);
            this.k = i6;
            this.l += i29;
            int i30 = 0;
            while (true) {
                i4 = this.l - 1;
                if (i30 >= i4) {
                    break;
                }
                while (true) {
                    i5 = this.m + 1;
                    j = i5;
                    long j5 = j * j3;
                    j2 = this.n;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i31 = i3;
                    qfa1Var.e(i31);
                    qfa1Var.j(i30, j4, j3);
                    this.n += i31;
                    this.k += i31;
                }
                int i32 = i3;
                this.m = i5;
                if (j == j4) {
                    this.m = 0;
                    dm5.y(j2 == j3 ? i32 : 0);
                    this.n = 0;
                }
                i30++;
                i3 = i32;
            }
            if (i4 == 0) {
                return;
            }
            System.arraycopy(qfa1Var.m(), i4 * i9, qfa1Var.m(), 0, (this.l - i4) * i9);
            this.l -= i4;
            return;
        }
        a(0, this.j);
        this.j = 0;
        f = f4;
        i3 = 1;
        if (f != 1.0f) {
        }
    }
}
