package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class df5 {
    public static final mmr0 a;

    static {
        z6x z6xVar = z6x.a;
        a = new mmr0(z6xVar, z6xVar);
    }

    public static final void a(af5 af5Var, List list, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1794596951);
        int i2 = (i & 6) == 0 ? (x340Var.g(af5Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(list) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ze5 ze5Var = (ze5) list.get(i3);
                xu30 xu30Var = (xu30) ze5Var.a;
                int i4 = ze5Var.b;
                int i5 = ze5Var.c;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = td4.d;
                    x340Var.s0(objT);
                }
                gfh0 gfh0Var = (gfh0) objT;
                int iHashCode = Long.hashCode(tgp1.l(x340Var));
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
                xu30Var.invoke(af5Var.subSequence(i4, i5).b, x340Var, 0);
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(af5Var, list, i, (byte) 0);
        }
    }
}
