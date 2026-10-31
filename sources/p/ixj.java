package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ixj implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ixj(List list, txj txjVar, cxc0 cxc0Var, int i) {
        this.a = (byte) 0;
        this.c = list;
        this.d = txjVar;
        this.e = cxc0Var;
        this.b = i;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        List list = this.c;
        switch (b) {
            case 0:
                txj txjVar = (txj) obj6;
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
                    String str = (String) list.get(iIntValue);
                    x340Var2.i0(1100766831);
                    txjVar.a(48, apo.r(261180434, new mk0(txjVar, str, (cxc0) obj5, this.b, iIntValue), x340Var2), x340Var2, anm1.N("list_ux_platform_section_with_description: ".concat(str), nim0Var));
                    x340Var2.r(false);
                }
                break;
            case 1:
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
                    ki90 ki90Var = (ki90) ((ArrayList) list).get(iIntValue3);
                    x340Var4.i0(839066378);
                    otw.c((maa) ((ynb0) ((ahi0) obj6).g).get(), new gu31(ki90Var, iIntValue3 + this.b, (String) obj5), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                }
                break;
            default:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var6.b0();
                } else {
                    cr01 cr01Var = (cr01) list.get(iIntValue5);
                    x340Var6.i0(-2018645064);
                    du01 du01Var = (du01) obj6;
                    otw.c((kt01) obj5, new aw01(iIntValue5, cr01Var, du01Var.c, du01Var.d, this.b), aqb0.b(aqb0Var3, nim0Var, (pxg1) null, (ni20) null, 5), (ipb1) null, x340Var6, 0, 8);
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ ixj(List list, Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = list;
        this.d = obj;
        this.b = i;
        this.e = obj2;
    }
}
