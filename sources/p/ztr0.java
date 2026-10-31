package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ztr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztr0(Function0 function0, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarN = anm1.N("parental_consent_close_button", nim0Var);
                    boolean zG = x340Var2.g(function0) | x340Var2.i(ven0Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new swi0(function0, ven0Var, (byte) 5);
                        x340Var2.s0(objT);
                    }
                    wro1.h(new gbx(z50Var, (Function0) objT), ldx.c, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, u5j.a, x340Var2, 0, 6, 1016);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qim0 qim0VarN2 = anm1.N("parental_consent_close_button", nim0Var);
                    boolean zG2 = x340Var4.g(function0) | x340Var4.i(ven0Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new swi0(function0, ven0Var, (byte) 6);
                        x340Var4.s0(objT2);
                    }
                    wro1.h(new gbx(z50Var, (Function0) objT2), ldx.c, qim0VarN2, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, x5j.a, x340Var4, 0, 6, 1016);
                }
                break;
        }
        return rih1Var;
    }
}
