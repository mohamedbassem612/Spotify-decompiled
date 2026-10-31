package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dhi0 implements zu30 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ j2i e;

    public dhi0(ArrayList arrayList, float f, int i, hdn0 hdn0Var, j2i j2iVar) {
        this.a = arrayList;
        this.b = f;
        this.c = i;
        this.d = hdn0Var;
        this.e = j2iVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            mey0 mey0Var = (mey0) this.a.get(iIntValue);
            x340Var2.i0(-524929302);
            qim0 qim0VarV = u291.v(nim0.a, zjy.j(this.c, new p3v(this.b)).a);
            hdn0 hdn0Var = this.d;
            boolean zI = x340Var2.i(hdn0Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new myg0(hdn0Var, (byte) 4);
                x340Var2.s0(objT);
            }
            qim0 qim0VarU = lrn1.u(qim0VarV, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarU);
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
            this.e.J(Integer.valueOf(iIntValue), mey0Var, x340Var2, Integer.valueOf((i2 >> 3) & 14));
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
