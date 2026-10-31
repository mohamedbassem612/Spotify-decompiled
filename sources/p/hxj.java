package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hxj implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ txj d;
    public final /* synthetic */ n8b1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ r6h1 i;
    public final /* synthetic */ w061 t;

    public /* synthetic */ hxj(List list, List list2, txj txjVar, n8b1 n8b1Var, int i, boolean z, tob1 tob1Var, r6h1 r6h1Var, w061 w061Var, byte b) {
        this.a = b;
        this.b = list;
        this.c = list2;
        this.d = txjVar;
        this.e = n8b1Var;
        this.f = i;
        this.g = z;
        this.h = tob1Var;
        this.i = r6h1Var;
        this.t = w061Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = this.f;
        n8b1 n8b1Var = this.e;
        nim0 nim0Var = nim0.a;
        List list = this.b;
        List list2 = this.c;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    hwq hwqVar = (hwq) list.get(iIntValue);
                    x340Var2.i0(-1444338119);
                    hwq hwqVar2 = (hwq) o7h.t0(iIntValue + 1, list2);
                    String strA = hwqVar2 != null ? hwqVar2.g.a() : null;
                    hwq hwqVar3 = (hwq) o7h.t0(iIntValue - 1, list2);
                    String strA2 = hwqVar3 != null ? hwqVar3.g.a() : null;
                    qim0 qim0VarN = anm1.N("list_ux_platform_item_with_index: " + (i2 + iIntValue), aqb0.b(aqb0Var, nim0Var, (pxg1) null, n8b1Var, 5));
                    w061 w061Var = this.t;
                    txj txjVar = this.d;
                    txjVar.a(48, apo.r(-2035927248, new exj(txjVar, hwqVar, strA, strA2, this.g, this.h, this.i, w061Var, (byte) 1), x340Var2), x340Var2, qim0VarN);
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    z = true;
                    i = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    z = true;
                    i = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i & 1, (i & 147) != 146 ? z : false)) {
                    x340Var4.b0();
                } else {
                    hwq hwqVar4 = (hwq) list.get(iIntValue3);
                    x340Var4.i0(-1782436956);
                    hwq hwqVar5 = (hwq) o7h.t0(iIntValue3 + 1, list2);
                    String strA3 = hwqVar5 != null ? hwqVar5.g.a() : null;
                    hwq hwqVar6 = (hwq) o7h.t0(iIntValue3 - 1, list2);
                    String strA4 = hwqVar6 != null ? hwqVar6.g.a() : null;
                    qim0 qim0VarN2 = anm1.N("list_ux_platform_item_with_index: " + (i2 + iIntValue3), aqb0.b(aqb0Var2, nim0Var, (pxg1) null, n8b1Var, 5));
                    w061 w061Var2 = this.t;
                    txj txjVar2 = this.d;
                    txjVar2.a(48, apo.r(-1351294801, new exj(txjVar2, hwqVar4, strA3, strA4, this.g, this.h, this.i, w061Var2, (byte) 0), x340Var4), x340Var4, qim0VarN2);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
