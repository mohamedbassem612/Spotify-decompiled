package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vw90 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ lw90 c;
    public final /* synthetic */ ldo d;

    public /* synthetic */ vw90(List list, lw90 lw90Var, ldo ldoVar, byte b) {
        this.a = b;
        this.b = list;
        this.c = lw90Var;
        this.d = ldoVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lw90 lw90Var = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    fw90 fw90Var = (fw90) list.get(iIntValue);
                    x340Var2.i0(-1301767473);
                    acq0.r(fw90Var, iIntValue, lw90Var.a(), 1, this.d, x340Var2, 3072 | (i3 & 112));
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i = 3072;
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i = 3072;
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    fw90 fw90Var2 = (fw90) list.get(iIntValue3);
                    x340Var4.i0(890724292);
                    acq0.r(fw90Var2, iIntValue3, lw90Var.a(), 2, this.d, x340Var4, i | (i2 & 112));
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
