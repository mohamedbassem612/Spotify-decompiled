package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oh50 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ cv30 c;

    public /* synthetic */ oh50(List list, cv30 cv30Var, byte b) {
        this.a = b;
        this.b = list;
        this.c = cv30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) j2iVar;
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (((x340) b0kVar).g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= ((x340) b0kVar).e(iIntValue) ? 32 : 16;
                }
                x340 x340Var = (x340) b0kVar;
                if (!x340Var.Y(i & 1, (i & 147) != 146)) {
                    x340Var.b0();
                } else {
                    dji0 dji0Var = (dji0) ((ArrayList) list).get(iIntValue);
                    x340Var.i0(-681726003);
                    boolean zG = x340Var.g(iu30Var) | x340Var.g(dji0Var);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new hs20(iu30Var, dji0Var, (byte) 15);
                        x340Var.s0(objT);
                    }
                    jhc1.h(dji0Var, (Function0) objT, u291.f(nim0.a, 1.0f), x340Var, 0);
                    x340Var.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b0k b0kVar2 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((x340) b0kVar2).g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((x340) b0kVar2).e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var2 = (x340) b0kVar2;
                if (!x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    wdo0 wdo0Var = (wdo0) list.get(iIntValue3);
                    x340Var2.i0(493993922);
                    j2iVar.invoke(wdo0Var, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
