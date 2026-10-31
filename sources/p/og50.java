package p;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class og50 extends j660 {
    public rf50 n0;
    public int o0;
    public int p0;
    public int q0;
    public float r0;
    public float s0;
    public String t0;
    public String u0;
    public String v0;
    public String w0;

    public og50(ynb1 ynb1Var, int i) {
        super(ynb1Var, i);
        if (i == 10) {
            this.p0 = 1;
        } else if (i == 11) {
            this.q0 = 1;
        }
    }

    @Override // p.j660
    public final l660 Z() {
        int[][] iArrJ0;
        int[][] iArrJ1;
        boolean[][] zArr;
        rf50 rf50Var = this.n0;
        if (rf50Var == null) {
            rf50Var = new rf50();
            rf50Var.U0 = 0;
            rf50Var.W0 = new HashSet();
            rf50Var.l0();
            int[][] iArr = rf50Var.X0;
            boolean z = iArr != null && iArr.length == ((l660) rf50Var).v0 && (zArr = rf50Var.V0) != null && zArr.length == rf50Var.J0 && zArr[0].length == rf50Var.L0;
            if (!z) {
                rf50Var.h0();
            }
            if (z) {
                for (int i = 0; i < rf50Var.V0.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = rf50Var.V0;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < rf50Var.X0.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = rf50Var.X0;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            rf50Var.U0 = 0;
            String str = rf50Var.S0;
            if (str != null && !str.trim().isEmpty() && (iArrJ1 = rf50.j0(rf50Var.S0)) != null) {
                rf50Var.f0(iArrJ1);
            }
            String str2 = rf50Var.R0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrJ0 = rf50.j0(rf50Var.R0)) != null) {
                rf50Var.g0(iArrJ0);
            }
            this.n0 = rf50Var;
        }
        return rf50Var;
    }

    @Override // p.j660, p.dil, p.u811, p.od10
    public final void apply() {
        Z();
        rf50 rf50Var = this.n0;
        int i = this.o0;
        rf50Var.getClass();
        if ((i == 0 || i == 1) && rf50Var.T0 != i) {
            rf50Var.T0 = i;
        }
        int i2 = this.p0;
        if (i2 != 0) {
            rf50 rf50Var2 = this.n0;
            if (i2 > 50) {
                rf50Var2.getClass();
            } else if (rf50Var2.K0 != i2) {
                rf50Var2.K0 = i2;
                rf50Var2.l0();
                rf50Var2.h0();
            }
        }
        int i3 = this.q0;
        if (i3 != 0) {
            rf50 rf50Var3 = this.n0;
            if (i3 > 50) {
                rf50Var3.getClass();
            } else if (rf50Var3.M0 != i3) {
                rf50Var3.M0 = i3;
                rf50Var3.l0();
                rf50Var3.h0();
            }
        }
        float f = this.r0;
        if (f != 0.0f) {
            rf50 rf50Var4 = this.n0;
            if (f < 0.0f) {
                rf50Var4.getClass();
            } else if (rf50Var4.N0 != f) {
                rf50Var4.N0 = f;
            }
        }
        float f2 = this.s0;
        if (f2 != 0.0f) {
            rf50 rf50Var5 = this.n0;
            if (f2 < 0.0f) {
                rf50Var5.getClass();
            } else if (rf50Var5.O0 != f2) {
                rf50Var5.O0 = f2;
            }
        }
        String str = this.t0;
        if (str != null && !str.equals("")) {
            rf50 rf50Var6 = this.n0;
            String str2 = this.t0;
            String str3 = rf50Var6.P0;
            if (str3 == null || !str3.equals(str2)) {
                rf50Var6.P0 = str2;
            }
        }
        String str4 = this.u0;
        if (str4 != null && !str4.equals("")) {
            rf50 rf50Var7 = this.n0;
            String str5 = this.u0;
            String str6 = rf50Var7.Q0;
            if (str6 == null || !str6.equals(str5)) {
                rf50Var7.Q0 = str5;
            }
        }
        String str7 = this.v0;
        if (str7 != null && !str7.equals("")) {
            rf50 rf50Var8 = this.n0;
            String str8 = this.v0;
            String str9 = rf50Var8.R0;
            if (str9 == null || !str9.equals(str8.toString())) {
                rf50Var8.R0 = str8.toString();
            }
        }
        String str10 = this.w0;
        if (str10 != null && !str10.equals("")) {
            rf50 rf50Var9 = this.n0;
            String str11 = this.w0;
            String str12 = rf50Var9.S0;
            if (str12 == null || !str12.equals(str11)) {
                rf50Var9.S0 = str11;
            }
        }
        Y();
    }
}
