package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fyj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ et90 c;
    public final /* synthetic */ dyj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyj0(iu30 iu30Var, et90 et90Var, dyj0 dyj0Var, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = et90Var;
        this.d = dyj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dyj0 dyj0Var = this.d;
        et90 et90Var = this.c;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarN = anm1.N("mixing_dialog_secondary_button", nim0Var);
                    ldx ldxVar = ldx.c;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new stj0(iu30Var, (byte) 3);
                        x340Var2.s0(objT);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1073374153, new eyj0(et90Var, dyj0Var, (byte) 0), x340Var2), x340Var2, 432, 48, 2040);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qim0 qim0VarN2 = anm1.N("mixing_dialog_primary_button", nim0Var);
                    idx idxVar = new idx(4);
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new stj0(iu30Var, (byte) 5);
                        x340Var4.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), idxVar, qim0VarN2, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(568921974, new eyj0(et90Var, dyj0Var, (byte) 3), x340Var4), x340Var4, 384, 48, 2040);
                }
                break;
        }
        return rih1Var;
    }
}
