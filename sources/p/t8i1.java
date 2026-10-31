package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8i1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8i1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8i1(u8i1 u8i1Var, byte b) {
        super(2);
        this.a = b;
        this.b = u8i1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u8i1 u8i1Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    e680 e680Var = u8i1Var.c;
                    boolean zI = x340Var2.i(u8i1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        obj3 = objT;
                        dch1 dch1Var = new dch1(u8i1Var, (byte) 11);
                        x340Var2.s0(dch1Var);
                        obj3 = dch1Var;
                    }
                    obj3 = objT;
                    epo1.y(e680Var, (Function0) obj3, u8i1Var.e, u8i1Var.f, (qim0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1975057138, new t8i1(u8i1Var, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
