package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class i2u {
    public static final k960 a = new k960(0.82f, 0.82f);

    public static final void a(String str, String str2, String str3, String str4, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str5;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1849438151);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str5 = str4;
            i2 |= x340Var2.g(str5) ? 2048 : 1024;
        } else {
            str5 = str4;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            float f2 = 0.82f * f;
            float f3 = 0.6333333f * f2;
            float f4 = 0.51666665f * f2;
            float f5 = 0.48333332f * f2;
            qim0 qim0VarR = u291.r(qim0Var, f2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarR);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            Uri uri = str.length() > 0 ? Uri.parse(str) : Uri.EMPTY;
            hcx hcxVarN = j1p1.n(f3, x340Var2);
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            bmq0.a(uri, u291.r(nim0Var, f3), hcxVarN, (String) null, str2, 0L, 0L, false, x340Var2, (i2 << 9) & 57344, 232);
            bmq0.a(str3.length() > 0 ? Uri.parse(str3) : Uri.EMPTY, sto1.o(eqr0.C(u291.r(nim0Var, f4), f5, f5), 8.0f, er31.a, false, 0L, 0L, 24), j1p1.n(f4, x340Var2), (String) null, str5, 0L, 0L, false, x340Var2, (i3 << 3) & 57344, 232);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h2u(str, str2, str3, str4, f, qim0Var, i);
        }
    }
}
