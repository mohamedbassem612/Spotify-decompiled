package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class qqu {
    public static final List a = p7h.M(new Integer[]{4, 5, 6, 7, 8, 8, 8, 8, 8});

    public static final void a(int i, Integer num, float f, long j, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(372826590);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.g(num) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = num != null && i == num.intValue();
            float f2 = z ? 12.0f : f;
            float f3 = z ? 1.0f : 0.3f;
            ceo ceoVar = klv.c;
            t1c.a(dug.f(d9y0.k(u291.r(nim0.a, ((Number) z95.b(f2, irn1.o0(300, 0, ceoVar, 2), "dotSize", (iu30) null, x340Var, 3072, 20).getValue()).floatValue()), ((Number) z95.b(f3, irn1.o0(300, 0, ceoVar, 2), "dotAlpha", (iu30) null, x340Var, 3072, 20).getValue()).floatValue()), j, er31.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pqu(i, num, f, j, i2);
        }
    }

    public static final void b(int i, long j, b0k b0kVar, boolean z) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1146680659);
        int i2 = (x340Var2.h(z) ? 4 : 2) | i | (x340Var2.f(j) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            float f = z ? 1.0f : 0.0f;
            ceo ceoVar = klv.c;
            tob1 tob1VarB = z95.b(f, irn1.o0(300, 0, ceoVar, 2), "checkAlpha", (iu30) null, x340Var2, 3072, 20);
            tob1 tob1VarB2 = z95.b(z ? 0.0f : 1.0f, irn1.o0(300, 0, ceoVar, 2), "pinAlpha", (iu30) null, x340Var2, 3072, 20);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarS = u291.s(nim0Var, 18.0f, 24.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarS);
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
            cwl1.f(i3o1.n(2131233732, x340Var2, 0), (String) null, d9y0.k(u291.s(nim0Var, 18.0f, 24.0f), ((Number) tob1VarB2.getValue()).floatValue()), (tl3) null, (j6m) null, 0.0f, new f2b(j, 5), x340Var2, 56, 56);
            w0h1.a(klx.c, isl.a, d9y0.k(u291.r(nim0Var, 16.0f), ((Number) tob1VarB.getValue()).floatValue()), j, 0L, false, x340Var2, klx.d | 48 | ((i2 << 6) & 7168), 48);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new me3(z, j, i);
        }
    }

    public static final void c(float f, int i, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2016859439);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(t4k.n.a(flb0.a), apo.r(-1526167057, new n5h(f), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(f, qim0Var, i, (byte) 3);
        }
    }
}
