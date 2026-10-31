package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pk11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk11 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ maa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk11(nk11 nk11Var, iu30 iu30Var, maa maaVar, byte b) {
        super(2);
        this.a = b;
        this.b = nk11Var;
        this.c = iu30Var;
        this.d = maaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        maa maaVar = this.d;
        iu30 iu30Var = this.c;
        nk11 nk11Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2i j2iVarR = apo.r(1764540625, new hov0(maaVar, nk11Var, (byte) 27), x340Var2);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.g(nk11Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        zkz0 zkz0Var = new zkz0(iu30Var, nk11Var, (byte) 22);
                        x340Var2.s0(zkz0Var);
                        obj3 = zkz0Var;
                    }
                    obj3 = objT;
                    u2p1.b(nk11Var, j2iVarR, new gbx(z50.c, (Function0) obj3), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(939240355, new pk11(nk11Var, iu30Var, maaVar, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
