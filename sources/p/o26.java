package p;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o26 extends dxo1 {
    public final double[] b;
    public final n26[] c;

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.o26] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.o26] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public o26(int[] iArr, double[] dArr, double[][] dArr2) {
        ?? r6;
        ?? r5;
        double d;
        boolean z;
        double[] dArr3;
        boolean z2;
        ?? r7;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.b = dArr4;
        boolean z3 = true;
        obj.c = new n26[dArr4.length - 1];
        char c = 0;
        int i = 0;
        boolean z4 = true;
        ?? r8 = 1;
        ?? r0 = obj;
        while (true) {
            n26[] n26VarArr = r0.c;
            if (i >= n26VarArr.length) {
                return;
            }
            int i2 = iArr[i];
            if (i2 == 0) {
                r6 = 3;
                r5 = z4;
            } else if (i2 == z3) {
                r7 = z3;
                r6 = r7;
                r5 = r7;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (z4 != z3) {
                            r7 = z3;
                        }
                        r6 = r7;
                        r5 = r7;
                    } else if (i2 == 4) {
                        r6 = 4;
                        r5 = z4;
                    } else if (i2 == 5) {
                        r6 = 5;
                        r5 = z4;
                    }
                }
                r5 = z4;
                r6 = r8;
                r7 = 2;
                r6 = r7;
                r5 = r7;
            }
            double d2 = dArr4[i];
            int i3 = i + 1;
            double d3 = dArr4[i3];
            double[] dArr5 = dArr2[i];
            double d4 = dArr5[c];
            boolean z5 = z3;
            int i4 = i;
            double d5 = dArr5[z5 ? 1 : 0];
            double[] dArr6 = dArr2[i3];
            ?? r21 = c;
            double d6 = dArr6[r21 == true ? 1 : 0];
            double d7 = dArr6[z5 ? 1 : 0];
            n26 n26Var = new n26();
            n26Var.r = r21;
            ?? r13 = r5;
            double d8 = d6 - d4;
            double d9 = d7 - d5;
            boolean z6 = z5 ? 1 : 0;
            if (r6 != z6) {
                if (r6 == 4) {
                    z2 = d9 > 0.0d;
                    n26Var.q = z2;
                } else if (r6 != 5) {
                    z2 = false;
                    n26Var.q = false;
                } else {
                    z2 = d9 < 0.0d;
                    n26Var.q = z2;
                }
                d = d2;
                z = z2;
                z6 = true;
            } else {
                n26Var.q = z6;
                d = d2;
                z = z6 ? 1 : 0;
            }
            n26Var.c = d;
            n26Var.d = d3;
            double d10 = d3 - d;
            double d11 = 1.0d / d10;
            n26Var.i = d11;
            if (3 == r6) {
                n26Var.r = z6;
            } else {
                if (Math.abs(d8) < 0.001d || Math.abs(d9) < 0.001d) {
                    z6 = true;
                } else {
                    double[] dArr7 = new double[EnergyProfile.EVCONNECTOR_TYPE_OTHER];
                    n26Var.a = dArr7;
                    n26Var.j = ((double) (z ? -1 : 1)) * d8;
                    n26Var.k = d9 * ((double) (z ? 1 : -1));
                    n26Var.l = z ? d6 : d4;
                    n26Var.m = z ? d5 : d7;
                    double d12 = d5 - d7;
                    double dHypot = 0.0d;
                    double d13 = 0.0d;
                    double d14 = 0.0d;
                    int i5 = 0;
                    while (true) {
                        dArr3 = n26.s;
                        if (i5 >= 91) {
                            break;
                        }
                        double[] dArr8 = dArr7;
                        double radians = Math.toRadians((((double) i5) * 90.0d) / 90.0d);
                        double dSin = Math.sin(radians) * d8;
                        double dCos = Math.cos(radians) * d12;
                        if (i5 > 0) {
                            dHypot += Math.hypot(dSin - d13, dCos - d14);
                            dArr3[i5] = dHypot;
                        }
                        i5++;
                        d14 = dCos;
                        d13 = dSin;
                        dArr7 = dArr8;
                    }
                    double[] dArr9 = dArr7;
                    n26Var.b = dHypot;
                    for (int i6 = 0; i6 < 91; i6++) {
                        dArr3[i6] = dArr3[i6] / dHypot;
                    }
                    for (int i7 = 0; i7 < 101; i7++) {
                        double d15 = ((double) i7) / 100.0d;
                        int iBinarySearch = Arrays.binarySearch(dArr3, d15);
                        if (iBinarySearch >= 0) {
                            dArr9[i7] = ((double) iBinarySearch) / 90.0d;
                        } else if (iBinarySearch == -1) {
                            dArr9[i7] = 0.0d;
                        } else {
                            int i8 = -iBinarySearch;
                            int i9 = i8 - 2;
                            double d16 = dArr3[i9];
                            dArr9[i7] = (((d15 - d16) / (dArr3[i8 - 1] - d16)) + ((double) i9)) / 90.0d;
                        }
                    }
                    n26Var.n = n26Var.b * n26Var.i;
                    z6 = true;
                }
                n26VarArr[i4] = n26Var;
                r0 = this;
                dArr4 = dArr;
                z3 = z6;
                i = i3;
                z4 = r13 == true ? 1 : 0;
                c = 0;
                r8 = r6;
            }
            n26Var.r = z6;
            n26Var.e = d4;
            n26Var.f = d6;
            n26Var.g = d5;
            n26Var.h = d7;
            double dHypot2 = Math.hypot(d9, d8);
            n26Var.b = dHypot2;
            n26Var.n = dHypot2 * d11;
            n26Var.l = d8 / d10;
            n26Var.m = d9 / d10;
            n26VarArr[i4] = n26Var;
            r0 = this;
            dArr4 = dArr;
            z3 = z6;
            i = i3;
            z4 = r13 == true ? 1 : 0;
            c = 0;
            r8 = r6;
        }
    }

    public final double m(double d) {
        n26[] n26VarArr = this.c;
        n26 n26Var = n26VarArr[0];
        double d2 = n26Var.c;
        if (d < d2) {
            double d3 = d - d2;
            if (n26Var.r) {
                return (d3 * n26VarArr[0].l) + n26Var.c(d2);
            }
            n26Var.g(d2);
            return (n26VarArr[0].a() * d3) + n26VarArr[0].e();
        }
        if (d > n26VarArr[n26VarArr.length - 1].d) {
            double d4 = n26VarArr[n26VarArr.length - 1].d;
            double d5 = d - d4;
            int length = n26VarArr.length - 1;
            return (d5 * n26VarArr[length].l) + n26VarArr[length].c(d4);
        }
        for (int i = 0; i < n26VarArr.length; i++) {
            n26 n26Var2 = n26VarArr[i];
            if (d <= n26Var2.d) {
                if (n26Var2.r) {
                    return n26Var2.c(d);
                }
                n26Var2.g(d);
                return n26VarArr[i].e();
            }
        }
        return Double.NaN;
    }

    public final void n(double d, double[] dArr) {
        n26[] n26VarArr = this.c;
        n26 n26Var = n26VarArr[0];
        double d2 = n26Var.c;
        if (d < d2) {
            double d3 = d - d2;
            if (n26Var.r) {
                double dC = n26Var.c(d2);
                n26 n26Var2 = n26VarArr[0];
                dArr[0] = (n26Var2.l * d3) + dC;
                dArr[1] = (d3 * n26VarArr[0].m) + n26Var2.d(d2);
                return;
            }
            n26Var.g(d2);
            dArr[0] = (n26VarArr[0].a() * d3) + n26VarArr[0].e();
            dArr[1] = (n26VarArr[0].b() * d3) + n26VarArr[0].f();
            return;
        }
        if (d <= n26VarArr[n26VarArr.length - 1].d) {
            for (int i = 0; i < n26VarArr.length; i++) {
                n26 n26Var3 = n26VarArr[i];
                if (d <= n26Var3.d) {
                    if (n26Var3.r) {
                        dArr[0] = n26Var3.c(d);
                        dArr[1] = n26VarArr[i].d(d);
                        return;
                    } else {
                        n26Var3.g(d);
                        dArr[0] = n26VarArr[i].e();
                        dArr[1] = n26VarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = n26VarArr[n26VarArr.length - 1].d;
        double d5 = d - d4;
        int length = n26VarArr.length - 1;
        n26 n26Var4 = n26VarArr[length];
        if (n26Var4.r) {
            double dC2 = n26Var4.c(d4);
            n26 n26Var5 = n26VarArr[length];
            dArr[0] = (n26Var5.l * d5) + dC2;
            dArr[1] = (d5 * n26VarArr[length].m) + n26Var5.d(d4);
            return;
        }
        n26Var4.g(d);
        dArr[0] = (n26VarArr[length].a() * d5) + n26VarArr[length].e();
        dArr[1] = (n26VarArr[length].b() * d5) + n26VarArr[length].f();
    }

    public final void o(double d, float[] fArr) {
        n26[] n26VarArr = this.c;
        n26 n26Var = n26VarArr[0];
        double d2 = n26Var.c;
        if (d < d2) {
            double d3 = d - d2;
            if (n26Var.r) {
                double dC = n26Var.c(d2);
                n26 n26Var2 = n26VarArr[0];
                fArr[0] = (float) ((n26Var2.l * d3) + dC);
                fArr[1] = (float) ((d3 * n26VarArr[0].m) + n26Var2.d(d2));
                return;
            }
            n26Var.g(d2);
            fArr[0] = (float) ((n26VarArr[0].a() * d3) + n26VarArr[0].e());
            fArr[1] = (float) ((n26VarArr[0].b() * d3) + n26VarArr[0].f());
            return;
        }
        if (d <= n26VarArr[n26VarArr.length - 1].d) {
            for (int i = 0; i < n26VarArr.length; i++) {
                n26 n26Var3 = n26VarArr[i];
                if (d <= n26Var3.d) {
                    if (n26Var3.r) {
                        fArr[0] = (float) n26Var3.c(d);
                        fArr[1] = (float) n26VarArr[i].d(d);
                        return;
                    } else {
                        n26Var3.g(d);
                        fArr[0] = (float) n26VarArr[i].e();
                        fArr[1] = (float) n26VarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = n26VarArr[n26VarArr.length - 1].d;
        double d5 = d - d4;
        int length = n26VarArr.length - 1;
        n26 n26Var4 = n26VarArr[length];
        if (!n26Var4.r) {
            n26Var4.g(d);
            fArr[0] = (float) n26VarArr[length].e();
            fArr[1] = (float) n26VarArr[length].f();
        } else {
            double dC2 = n26Var4.c(d4);
            n26 n26Var5 = n26VarArr[length];
            fArr[0] = (float) ((n26Var5.l * d5) + dC2);
            fArr[1] = (float) ((d5 * n26VarArr[length].m) + n26Var5.d(d4));
        }
    }

    public final void p(double d, double[] dArr) {
        n26[] n26VarArr = this.c;
        double d2 = n26VarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > n26VarArr[n26VarArr.length - 1].d) {
            d = n26VarArr[n26VarArr.length - 1].d;
        }
        for (int i = 0; i < n26VarArr.length; i++) {
            n26 n26Var = n26VarArr[i];
            if (d <= n26Var.d) {
                if (n26Var.r) {
                    dArr[0] = n26Var.l;
                    dArr[1] = n26Var.m;
                    return;
                } else {
                    n26Var.g(d);
                    dArr[0] = n26VarArr[i].a();
                    dArr[1] = n26VarArr[i].b();
                    return;
                }
            }
        }
    }

    public final double[] q() {
        return this.b;
    }
}
