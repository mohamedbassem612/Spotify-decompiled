package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class lq01 {
    public static final cr31 a = er31.b(8.0f);
    public static final float b = 4.0f;

    public static final void a(x47 x47Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-583549290);
        int i2 = (x340Var.i(x47Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(-1193279517, new kf2(x47Var, z), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(x47Var, z, qim0Var2, i, (byte) 21);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1092199784);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cr31 cr31Var = a;
            t1c.a(cwl1.l0(dug.f(qim0Var, jA, cr31Var), 0L, cr31Var, 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 11);
        }
    }

    public static final void c(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-965356831);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b(u291.h(u291.f(nim0Var, 1.0f), f - b), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 10, f, i);
        }
    }

    public static final float d(yae1 yae1Var, wat watVar, lee1 lee1Var, int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("A");
        }
        return watVar.M0((int) (yae1.b(yae1Var, new af5(o7h.y0(arrayList, "\n", (String) null, (String) null, (iu30) null, 62)), lee1Var, 0, false, i, 0L, (flb0) null, (wat) null, (f930) null, 2028).c & 4294967295L));
    }
}
