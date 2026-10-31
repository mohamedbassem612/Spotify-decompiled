package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zdl implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ idl c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ vu30 f;

    public /* synthetic */ zdl(ArrayList arrayList, idl idlVar, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = idlVar;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = vu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.b;
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
                    kdl kdlVar = (kdl) arrayList.get(iIntValue);
                    x340Var2.i0(-2124144198);
                    i541.a(this.c, kdlVar, this.d, this.e, this.f, x340Var2, 72);
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
                    kdl kdlVar2 = (kdl) arrayList.get(iIntValue3);
                    x340Var4.i0(498540657);
                    i541.a(this.c, kdlVar2, this.d, this.e, this.f, x340Var4, 72);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
