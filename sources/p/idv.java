package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class idv implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mv51 c;

    public idv(List list, int i, mv51 mv51Var) {
        this.a = list;
        this.b = i;
        this.c = mv51Var;
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
            ycv ycvVar = (ycv) this.a.get(iIntValue);
            x340Var2.i0(866036069);
            int i2 = iIntValue + this.b;
            String strC = f4i1.c(i2, "dsl_selection_list_");
            boolean zE = x340Var2.e(i2);
            Object objT = x340Var2.T();
            if (zE || objT == fkj0.X) {
                objT = new uv4(i2, (byte) 19);
                x340Var2.s0(objT);
            }
            dgo1.c(strC, (iu30) objT, apo.r(939793835, new o1t(this.c, ycvVar, (byte) 12), x340Var2), x340Var2, 384);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
