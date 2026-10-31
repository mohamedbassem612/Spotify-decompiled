package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c7g0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ eyr0 c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ c7g0(ArrayList arrayList, eyr0 eyr0Var, ArrayList arrayList2, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = eyr0Var;
        this.d = arrayList2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.d;
        eyr0 eyr0Var = this.c;
        ArrayList arrayList2 = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    mxr0 mxr0Var = (mxr0) arrayList2.get(iIntValue);
                    x340Var2.i0(-693870888);
                    kln1.b(eyr0Var, new txr0(mxr0Var.b, mxr0Var.d), iIntValue < p7h.L(arrayList), x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    bzr0 bzr0Var = (bzr0) arrayList2.get(iIntValue3);
                    x340Var4.i0(-1623542292);
                    kln1.b(eyr0Var, new vxr0(28, bzr0Var.b, null, bzr0Var.d, false), iIntValue3 < p7h.L(arrayList), x340Var4, 0);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
