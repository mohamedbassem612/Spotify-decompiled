package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l8h0 {
    public static final long a = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L);

    public static final void a(bl80 bl80Var, hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1658738498);
        int i2 = i | (x340Var.g(bl80Var) ? 4 : 2) | (x340Var.e(hcxVar.ordinal()) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = bl80Var.c;
            if (str == null) {
                str = "";
            }
            bmq0.a(Uri.parse(str), sto1.k(qim0Var, er31.a, new bw61(6.0f, u7h.b, 0.0f, a, 0.3f, 36, 0)), hcxVar, bl80Var.a, bl80Var.b, bl80Var.d, 0L, false, x340Var, (i2 << 3) & 896, 192);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(bl80Var, hcxVar, qim0Var, i, (byte) 6);
        }
    }

    public static final void b(ArrayList arrayList, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1844799699);
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            List listD1 = o7h.d1(arrayList, 2);
            qim0 qim0VarN = anm1.N("match-card-avatar-pair", d7e.r(1.0f, u291.f(u291.x(0.0f, 140.0f, 1, qim0Var), 1.0f), false));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = td4.h;
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-89115367);
            int i3 = 0;
            for (Object obj : listD1) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                a((bl80) obj, i3 == 0 ? hcx.e : hcx.d, anm1.N(i3 == 0 ? "match-card-first-avatar" : "match-card-second-avatar", nim0.a), x340Var, 0);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc0(arrayList, qim0Var, i, (byte) 3);
        }
    }
}
