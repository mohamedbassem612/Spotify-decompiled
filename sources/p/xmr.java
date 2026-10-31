package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xmr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ zmr c;
    public final /* synthetic */ xik d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmr(List list, zmr zmrVar, xik xikVar, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = zmrVar;
        this.d = xikVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xik xikVar = this.d;
        zmr zmrVar = this.c;
        List list = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    u5k u5kVar = new u5k(list);
                    boolean zI = x340Var2.i(zmrVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new wmr(zmrVar, b2);
                        x340Var2.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    wik wikVar = xikVar.t;
                    vbe.h(u5kVar, iu30Var, (qim0) null, wikVar != null ? new p3v(16.0f) : null, wikVar != null ? 0.0f : 8.0f, x340Var2, 0, 36);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(2019125495, new xmr(list, zmrVar, xikVar, b2), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
