package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mui1 implements hui1 {
    public x5j1 N0;
    public oe5 X;
    public float[] Y;
    public float[] Z;
    public final edn0 a;
    public final fdn0 b;
    public final short c;
    public final short d;
    public final dlv e;
    public int[] f = gui1.a;
    public float[] g;
    public oe5 h;
    public oe5 i;
    public oe5 t;

    /* JADX WARN: Multi-variable type inference failed */
    public mui1(edn0 edn0Var, fdn0 fdn0Var, int i, int i2, dlv dlvVar) {
        this.a = edn0Var;
        this.b = fdn0Var;
        this.c = i;
        this.d = i2;
        this.e = dlvVar;
        float[] fArr = gui1.b;
        this.g = fArr;
        this.Y = fArr;
        this.Z = fArr;
        this.N0 = gui1.c;
    }

    public final int a(int i) {
        int i2;
        edn0 edn0Var = this.a;
        int i3 = edn0Var.b;
        if (i3 <= 0) {
            eqr0.O("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = edn0Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        dlv dlvVar;
        float f;
        edn0 edn0Var = this.a;
        if (i >= edn0Var.b - 1) {
            f = i2;
        } else {
            int iC = edn0Var.c(i);
            int iC2 = edn0Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                lui1 lui1Var = (lui1) this.b.b(iC);
                if (lui1Var == null || (dlvVar = lui1Var.b) == null) {
                    dlvVar = this.e;
                }
                float f2 = i3;
                float fA = dlvVar.a((i2 - iC) / f2);
                return z ? fA : ((f2 * fA) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void d(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        float[] fArr;
        boolean z = this.N0 != gui1.c;
        oe5 oe5Var4 = this.h;
        fdn0 fdn0Var = this.b;
        edn0 edn0Var = this.a;
        if (oe5Var4 == null) {
            this.h = oe5Var.c();
            this.i = oe5Var3.c();
            int i = edn0Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = edn0Var.c(i2) / 1000.0f;
            }
            this.g = fArr2;
            int i3 = edn0Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f = iArr;
        }
        if (z) {
            if (this.N0 != gui1.c && u890.j(this.t, oe5Var) && u890.j(this.X, oe5Var2)) {
                return;
            }
            this.t = oe5Var;
            this.X = oe5Var2;
            int iB = oe5Var.b() + (oe5Var.b() % 2);
            this.Y = new float[iB];
            this.Z = new float[iB];
            int i5 = edn0Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = edn0Var.c(i6);
                lui1 lui1Var = (lui1) fdn0Var.b(iC);
                if (iC == 0 && lui1Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = oe5Var.a(i7);
                    }
                } else if (iC == this.c && lui1Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = oe5Var2.a(i8);
                    }
                } else {
                    lui1Var.getClass();
                    oe5 oe5Var5 = lui1Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = oe5Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.N0 = new x5j1(this.f, this.g, fArr3);
        }
    }

    public final int f() {
        return this.c;
    }

    public final oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        int[] iArr = gui1.a;
        long jH = (j / 1000000) - ((long) h());
        long jF = f();
        if (jH < 0) {
            jH = 0;
        }
        long j2 = jH > jF ? jF : jH;
        if (j2 < 0) {
            return oe5Var3;
        }
        d(oe5Var, oe5Var2, oe5Var3);
        oe5 oe5Var4 = this.i;
        oe5Var4.getClass();
        int i = 0;
        if (this.N0 != gui1.c) {
            int i2 = (int) j2;
            float fC = c(a(i2), i2, false);
            float[] fArr = this.Z;
            p26[][] p26VarArr = (p26[][]) this.N0.b;
            float f = p26VarArr[0][0].a;
            float f2 = p26VarArr[p26VarArr.length - 1][0].b;
            if (fC < f) {
                fC = f;
            }
            if (fC <= f2) {
                f2 = fC;
            }
            int length = fArr.length;
            boolean z = false;
            for (p26[] p26VarArr2 : p26VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    p26 p26Var = p26VarArr2[i4];
                    if (f2 <= p26Var.b) {
                        if (p26Var.p) {
                            fArr[i3] = p26Var.q;
                            fArr[i3 + 1] = p26Var.r;
                        } else {
                            p26Var.c(f2);
                            fArr[i3] = p26Var.a();
                            fArr[i3 + 1] = p26Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                oe5Var4.e(fArr[i], i);
                i++;
            }
        } else {
            oe5 oe5VarN = n((j2 - 1) * 1000000, oe5Var, oe5Var2, oe5Var3);
            oe5 oe5VarN2 = n(j2 * 1000000, oe5Var, oe5Var2, oe5Var3);
            int iB = oe5VarN.b();
            while (i < iB) {
                oe5Var4.e((oe5VarN.a(i) - oe5VarN2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return oe5Var4;
    }

    public final int h() {
        return this.d;
    }

    public final oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        oe5 oe5Var4;
        oe5 oe5Var5;
        oe5 oe5Var6 = oe5Var;
        int[] iArr = gui1.a;
        long jH = (j / 1000000) - ((long) h());
        long jF = f();
        if (jH < 0) {
            jH = 0;
        }
        if (jH <= jF) {
            jF = jH;
        }
        int i = (int) jF;
        fdn0 fdn0Var = this.b;
        lui1 lui1Var = (lui1) fdn0Var.b(i);
        if (lui1Var != null) {
            return lui1Var.a;
        }
        if (i >= this.c) {
            return oe5Var2;
        }
        if (i <= 0) {
            return oe5Var6;
        }
        d(oe5Var6, oe5Var2, oe5Var3);
        oe5 oe5Var7 = this.h;
        oe5Var7.getClass();
        int i2 = 0;
        if (this.N0 != gui1.c) {
            float fC = c(a(i), i, false);
            float[] fArr = this.Y;
            p26[][] p26VarArr = (p26[][]) this.N0.b;
            int length = p26VarArr.length - 1;
            float f = p26VarArr[0][0].a;
            float f2 = p26VarArr[length][0].b;
            int length2 = fArr.length;
            if (fC < f || fC > f2) {
                if (fC > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fC - f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    p26 p26Var = p26VarArr[length][i4];
                    boolean z = p26Var.p;
                    float f4 = p26Var.r;
                    float f5 = p26Var.q;
                    if (z) {
                        float f6 = p26Var.a;
                        float f7 = p26Var.k;
                        float f8 = p26Var.c;
                        fArr[i3] = (f5 * f3) + l1d.e(p26Var.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = p26Var.d;
                        fArr[i3 + 1] = (f4 * f3) + l1d.e(p26Var.f, f10, f9, f10);
                    } else {
                        p26Var.c(f);
                        fArr[i3] = (p26Var.a() * f3) + (p26Var.n * p26Var.h) + f5;
                        fArr[i3 + 1] = (p26Var.b() * f3) + (p26Var.o * p26Var.i) + f4;
                    }
                    i3 += 2;
                    i4++;
                    p26VarArr = p26VarArr;
                }
            } else {
                int length3 = p26VarArr.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        p26 p26Var2 = p26VarArr[i5][i7];
                        if (fC <= p26Var2.b) {
                            if (p26Var2.p) {
                                float f11 = p26Var2.a;
                                float f12 = p26Var2.k;
                                float f13 = p26Var2.c;
                                fArr[i6] = l1d.e(p26Var2.e, f13, (fC - f11) * f12, f13);
                                float f14 = p26Var2.d;
                                fArr[i6 + 1] = l1d.e(p26Var2.f, f14, (fC - f11) * f12, f14);
                            } else {
                                p26Var2.c(fC);
                                fArr[i6] = (p26Var2.n * p26Var2.h) + p26Var2.q;
                                fArr[i6 + 1] = (p26Var2.o * p26Var2.i) + p26Var2.r;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                oe5Var7.e(fArr[i8], i8);
            }
        } else {
            int iA = a(i);
            float fC2 = c(iA, i, true);
            edn0 edn0Var = this.a;
            lui1 lui1Var2 = (lui1) fdn0Var.b(edn0Var.c(iA));
            if (lui1Var2 != null && (oe5Var5 = lui1Var2.a) != null) {
                oe5Var6 = oe5Var5;
            }
            lui1 lui1Var3 = (lui1) fdn0Var.b(edn0Var.c(iA + 1));
            if (lui1Var3 == null || (oe5Var4 = lui1Var3.a) == null) {
                oe5Var4 = oe5Var2;
            }
            int iB = oe5Var7.b();
            for (int i9 = 0; i9 < iB; i9++) {
                oe5Var7.e((oe5Var4.a(i9) * fC2) + ((1.0f - fC2) * oe5Var6.a(i9)), i9);
            }
        }
        return oe5Var7;
    }
}
