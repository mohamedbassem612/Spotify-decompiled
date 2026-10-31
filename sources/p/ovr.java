package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ovr implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tvr c;

    public /* synthetic */ ovr(List list, tvr tvrVar, byte b) {
        this.a = b;
        this.b = list;
        this.c = tvrVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        List list = this.b;
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
                    p0v p0vVar = (p0v) list.get(iIntValue);
                    x340Var2.i0(-291622336);
                    otw.c(this.c, new v0v(p0vVar), aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7), (ipb1) null, x340Var2, 0, 8);
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
                    p0v p0vVar2 = (p0v) list.get(iIntValue3);
                    x340Var4.i0(-1145817242);
                    otw.c(this.c, new v0v(p0vVar2), aqb0.b(aqb0Var2, nim0Var, (pxg1) null, (ni20) null, 7), (ipb1) null, x340Var4, 0, 8);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
