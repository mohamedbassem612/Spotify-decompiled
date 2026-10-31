package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zwc1 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ axc1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iu30 d;

    public zwc1(List list, axc1 axc1Var, float f, iu30 iu30Var) {
        this.a = list;
        this.b = axc1Var;
        this.c = f;
        this.d = iu30Var;
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
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            bxc1 bxc1Var = (bxc1) this.a.get(iIntValue);
            x340Var2.i0(-980963613);
            p40 p40Var = this.b.a;
            qim0 qim0VarV = u291.v(nim0.a, this.c);
            iu30 iu30Var = this.d;
            boolean zG = x340Var2.g(iu30Var) | x340Var2.i(bxc1Var);
            if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = zG | z;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new ju01(iu30Var, bxc1Var, iIntValue, (byte) 7);
                x340Var2.s0(objT);
            }
            otw.c(p40Var, new iuc1(bxc1Var, iIntValue, qim0VarV, (iu30) objT), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
