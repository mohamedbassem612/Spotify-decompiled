package p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rf50 extends ljk1 {
    public djl H0;
    public cjl[] I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public float N0;
    public float O0;
    public String P0;
    public String Q0;
    public String R0;
    public String S0;
    public int T0;
    public int U0;
    public boolean[][] V0;
    public HashSet W0;
    public int[][] X0;

    public static void b0(cjl cjlVar) {
        cjlVar.n0[1] = -1.0f;
        cjlVar.K.j();
        cjlVar.M.j();
        cjlVar.N.j();
    }

    public static int[][] j0(String str) {
        try {
            String[] strArrSplit = str.split(",");
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            for (int i = 0; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split(":");
                String[] strArrSplit3 = strArrSplit2[1].split("x");
                iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
                iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
                iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
            }
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static float[] k0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    public final void Z(int i, int i2, int i3, int i4) {
        int i5;
        int[][] iArrJ0;
        int[][] iArrJ1;
        this.H0 = ((cjl) this).V;
        int i6 = this.J0;
        if (i6 >= 1 && (i5 = this.L0) >= 1) {
            this.U0 = 0;
            int iMax = Math.max(i6, i5);
            cjl[] cjlVarArr = this.I0;
            bjl bjlVar = bjl.c;
            if (cjlVarArr == null) {
                this.I0 = new cjl[iMax];
                int i7 = 0;
                while (true) {
                    cjl[] cjlVarArr2 = this.I0;
                    if (i7 >= cjlVarArr2.length) {
                        break;
                    }
                    cjl cjlVar = new cjl();
                    bjl[] bjlVarArr = cjlVar.U;
                    bjlVarArr[0] = bjlVar;
                    bjlVarArr[1] = bjlVar;
                    cjlVar.k = String.valueOf(cjlVar.hashCode());
                    cjlVarArr2[i7] = cjlVar;
                    i7++;
                }
            } else if (iMax != cjlVarArr.length) {
                cjl[] cjlVarArr3 = new cjl[iMax];
                for (int i8 = 0; i8 < iMax; i8++) {
                    cjl[] cjlVarArr4 = this.I0;
                    if (i8 < cjlVarArr4.length) {
                        cjlVarArr3[i8] = cjlVarArr4[i8];
                    } else {
                        cjl cjlVar2 = new cjl();
                        bjl[] bjlVarArr2 = cjlVar2.U;
                        bjlVarArr2[0] = bjlVar;
                        bjlVarArr2[1] = bjlVar;
                        cjlVar2.k = String.valueOf(cjlVar2.hashCode());
                        cjlVarArr3[i8] = cjlVar2;
                    }
                }
                while (true) {
                    cjl[] cjlVarArr5 = this.I0;
                    if (iMax >= cjlVarArr5.length) {
                        break;
                    }
                    cjl cjlVar3 = cjlVarArr5[iMax];
                    this.H0.u0.remove(cjlVar3);
                    cjlVar3.E();
                    iMax++;
                }
                this.I0 = cjlVarArr3;
            }
            String str = this.S0;
            if (str != null && !str.trim().isEmpty() && (iArrJ1 = j0(this.S0)) != null) {
                f0(iArrJ1);
            }
            String str2 = this.R0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrJ0 = j0(this.R0)) != null) {
                g0(iArrJ0);
            }
        }
        djl djlVar = this.H0;
        cjl[] cjlVarArr6 = this.I0;
        djlVar.getClass();
        for (cjl cjlVar4 : cjlVarArr6) {
            djlVar.W(cjlVar4);
        }
    }

    public final void c(yic0 yic0Var, boolean z) {
        int i;
        int i2;
        rf50 rf50Var;
        super/*p.cjl*/.c(yic0Var, z);
        int iMax = Math.max(this.J0, this.L0);
        cjl cjlVar = this.I0[0];
        float[] fArrK0 = k0(this.J0, this.P0);
        int i3 = this.J0;
        lhl lhlVar = ((cjl) this).M;
        lhl lhlVar2 = ((cjl) this).K;
        if (i3 == 1) {
            b0(cjlVar);
            cjlVar.K.a(lhlVar2, 0);
            cjlVar.M.a(lhlVar, 0);
        } else {
            int i4 = 0;
            while (true) {
                i = this.J0;
                if (i4 >= i) {
                    break;
                }
                cjl cjlVar2 = this.I0[i4];
                b0(cjlVar2);
                lhl lhlVar3 = cjlVar2.K;
                if (fArrK0 != null) {
                    cjlVar2.n0[1] = fArrK0[i4];
                }
                if (i4 > 0) {
                    lhlVar3.a(this.I0[i4 - 1].M, 0);
                } else {
                    lhlVar3.a(lhlVar2, 0);
                }
                int i5 = this.J0 - 1;
                lhl lhlVar4 = cjlVar2.M;
                if (i4 < i5) {
                    lhlVar4.a(this.I0[i4 + 1].K, 0);
                } else {
                    lhlVar4.a(lhlVar, 0);
                }
                if (i4 > 0) {
                    lhlVar3.g = (int) this.O0;
                }
                i4++;
            }
            while (i < iMax) {
                cjl cjlVar3 = this.I0[i];
                b0(cjlVar3);
                cjlVar3.K.a(lhlVar2, 0);
                cjlVar3.M.a(lhlVar, 0);
                i++;
            }
        }
        int iMax2 = Math.max(this.J0, this.L0);
        cjl cjlVar4 = this.I0[0];
        float[] fArrK1 = k0(this.L0, this.Q0);
        int i6 = this.L0;
        lhl lhlVar5 = ((cjl) this).L;
        lhl lhlVar6 = ((cjl) this).J;
        if (i6 == 1) {
            float[] fArr = cjlVar4.n0;
            lhl lhlVar7 = cjlVar4.L;
            lhl lhlVar8 = cjlVar4.J;
            fArr[0] = -1.0f;
            lhlVar8.j();
            lhlVar7.j();
            lhlVar8.a(lhlVar6, 0);
            lhlVar7.a(lhlVar5, 0);
        } else {
            int i7 = 0;
            while (true) {
                i2 = this.L0;
                if (i7 >= i2) {
                    break;
                }
                cjl cjlVar5 = this.I0[i7];
                float[] fArr2 = cjlVar5.n0;
                lhl lhlVar9 = cjlVar5.L;
                lhl lhlVar10 = cjlVar5.J;
                fArr2[0] = -1.0f;
                lhlVar10.j();
                lhlVar9.j();
                if (fArrK1 != null) {
                    cjlVar5.n0[0] = fArrK1[i7];
                }
                if (i7 > 0) {
                    lhlVar10.a(this.I0[i7 - 1].L, 0);
                } else {
                    lhlVar10.a(lhlVar6, 0);
                }
                if (i7 < this.L0 - 1) {
                    lhlVar9.a(this.I0[i7 + 1].J, 0);
                } else {
                    lhlVar9.a(lhlVar5, 0);
                }
                if (i7 > 0) {
                    lhlVar10.g = (int) this.N0;
                }
                i7++;
            }
            while (i2 < iMax2) {
                cjl cjlVar6 = this.I0[i2];
                float[] fArr3 = cjlVar6.n0;
                lhl lhlVar11 = cjlVar6.L;
                lhl lhlVar12 = cjlVar6.J;
                fArr3[0] = -1.0f;
                lhlVar12.j();
                lhlVar11.j();
                lhlVar12.a(lhlVar6, 0);
                lhlVar11.a(lhlVar5, 0);
                i2++;
            }
        }
        int i8 = 0;
        while (i8 < ((l660) this).v0) {
            if (this.W0.contains(((l660) this).u0[i8].k)) {
                rf50Var = this;
            } else {
                boolean z2 = false;
                int i9 = 0;
                while (!z2) {
                    i9 = this.U0;
                    if (i9 >= this.J0 * this.L0) {
                        i9 = -1;
                        break;
                    }
                    int iE0 = this.e0(i9);
                    int iD0 = this.d0(this.U0);
                    boolean[] zArr = this.V0[iE0];
                    if (zArr[iD0]) {
                        zArr[iD0] = false;
                        z2 = true;
                    }
                    this.U0++;
                }
                int iE1 = this.e0(i9);
                int iD1 = this.d0(i9);
                if (i9 == -1) {
                    return;
                }
                rf50Var = this;
                rf50Var.c0(iE1, iD1, 1, 1, ((l660) this).u0[i8]);
            }
            i8++;
            this = rf50Var;
        }
    }

    public final void c0(int i, int i2, int i3, int i4, cjl cjlVar) {
        cjlVar.J.a(this.I0[i2].J, 0);
        cjlVar.K.a(this.I0[i].K, 0);
        cjlVar.L.a(this.I0[(i2 + i4) - 1].L, 0);
        cjlVar.M.a(this.I0[(i + i3) - 1].M, 0);
    }

    public final int d0(int i) {
        return this.T0 == 1 ? i / this.J0 : i % this.L0;
    }

    public final int e0(int i) {
        return this.T0 == 1 ? i % this.J0 : i / this.L0;
    }

    public final void f0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!i0(e0(iArr2[0]), d0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void g0(int[][] iArr) {
        int i = 0;
        while (i < iArr.length) {
            int iE0 = this.e0(iArr[i][0]);
            int iD0 = this.d0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!this.i0(iE0, iD0, iArr2[1], iArr2[2])) {
                return;
            }
            cjl cjlVar = ((l660) this).u0[i];
            int[] iArr3 = iArr[i];
            rf50 rf50Var = this;
            rf50Var.c0(iE0, iD0, iArr3[1], iArr3[2], cjlVar);
            rf50Var.W0.add(((l660) rf50Var).u0[i].k);
            i++;
            this = rf50Var;
        }
    }

    public final void h0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.J0, this.L0);
        this.V0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = ((l660) this).v0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.X0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean i0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.V0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void l0() {
        int i;
        int i2 = this.K0;
        if (i2 != 0 && (i = this.M0) != 0) {
            this.J0 = i2;
            this.L0 = i;
            return;
        }
        int i3 = this.M0;
        if (i3 > 0) {
            this.L0 = i3;
            this.J0 = ((((l660) this).v0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.J0 = i2;
            this.L0 = ((((l660) this).v0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(((l660) this).v0) + 1.5d);
            this.J0 = iSqrt;
            this.L0 = ((((l660) this).v0 + iSqrt) - 1) / iSqrt;
        }
    }
}
