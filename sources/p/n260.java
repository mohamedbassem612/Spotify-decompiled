package p;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n260 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n260(pbq pbqVar, byte b) {
        super(2);
        this.a = b;
        this.b = pbqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) pbqVar.X;
                    wmy wmyVar = (wmy) pbqVar.i;
                    t1v0 t1v0Var = (t1v0) rwq.h((xe01) pbqVar.d, x340Var2, 0).getValue();
                    l260 l260Var = (l260) linkedHashMap.get(t1v0Var != null ? t1v0Var.a : null);
                    if (l260Var == null) {
                        x340Var2.i0(1736340183);
                        x340Var2.r(false);
                    } else {
                        maa maaVar = l260Var.b;
                        x340Var2.i0(1735821243);
                        ven0 ven0VarG = rwq.g((any) pbqVar.c, new cxc0(), (o8n) null, x340Var2, 0, 2);
                        wmyVar.t((o5b0) pbqVar.h, Collections.singleton(maaVar));
                        i1o1.d(maaVar, (cxc0) ven0VarG.getValue(), (rzq) wmyVar.d, goa0.a, (qim0) null, apo.r(-1124614509, new jb50(l260Var, (byte) 6), x340Var2), apo.r(795937722, new gn50(l260Var, (byte) 6), x340Var2), 0, (xu30) null, x340Var2, 1769472, 200);
                        x340Var2.r(false);
                    }
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str = (String) pbqVar.f;
                    boolean zI = x340Var4.i(pbqVar);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new m260(pbqVar, (byte) 1);
                        x340Var4.s0(objT);
                    }
                    dgo1.c(str, (iu30) objT, apo.r(1923429707, new n260(pbqVar, b2), x340Var4), x340Var4, 384);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                pbqVar.c((b0k) obj, czo1.p(1));
                break;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    pbqVar.c(x340Var6, 0);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    pbqVar.c(x340Var8, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n260(pbq pbqVar, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = pbqVar;
    }
}
