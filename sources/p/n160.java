package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n160 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p410 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n160(p410 p410Var, tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = p410Var;
        this.c = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.c;
        p410 p410Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    wmy wmyVar = (wmy) p410Var.c;
                    xpw xpwVar = (xpw) p410Var.f;
                    wmyVar.t(o5b0.a, Collections.singleton(xpwVar));
                    otw.c(xpwVar, (cxc0) tob1Var.getValue(), (qim0) null, wpb1.D("list_ux_platform_header_machine_header", xpwVar, tob1Var.getValue(), x340Var2, 6), x340Var2, 0, 4);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zI = x340Var4.i(p410Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        obj3 = objT;
                        m160 m160Var = new m160(p410Var, (byte) 1);
                        x340Var4.s0(m160Var);
                        obj3 = m160Var;
                    }
                    obj3 = objT;
                    dgo1.c("list_ux_platform_header_machine_header", (iu30) obj3, apo.r(-852395125, new n160(p410Var, tob1Var, z ? 1 : 0), x340Var4), x340Var4, 390);
                }
                break;
        }
        return rih1Var;
    }
}
