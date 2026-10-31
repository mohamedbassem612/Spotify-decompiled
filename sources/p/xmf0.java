package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xmf0 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dw91 c;
    public final /* synthetic */ tob1 d;

    public xmf0(List list, long j, dw91 dw91Var, tob1 tob1Var) {
        this.a = list;
        this.b = j;
        this.c = dw91Var;
        this.d = tob1Var;
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
            aef0 aef0Var = (aef0) this.a.get(iIntValue);
            x340Var2.i0(1656110258);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str = aef0Var.b;
            boolean z = iIntValue == ((Number) this.d.getValue()).intValue();
            dw91 dw91Var = this.c;
            boolean zI = ((((i & 112) ^ 48) > 32 && x340Var2.e(iIntValue)) || (i & 48) == 32) | x340Var2.i(dw91Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new gu90(dw91Var, iIntValue, (byte) 1);
                x340Var2.s0(objT);
            }
            d9y0.e(str, z, this.b, (iu30) objT, x340Var2, 0);
            op71.g(x340Var2, u291.h(nim0Var, 33.0f));
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
