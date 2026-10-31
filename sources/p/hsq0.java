package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hsq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ osq0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsq0(osq0 osq0Var, Function0 function0) {
        super(2);
        this.b = osq0Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = this.c;
        osq0 osq0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                osq0Var.g(function0, (b0k) obj, czo1.p(1));
                return rih1.a;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        osq0Var.i.getClass();
                        objT = new hkb1(function0);
                        x340Var2.s0(objT);
                    }
                    otw.c((hkb1) objT, rih1Var, (qim0) null, (ipb1) null, x340Var2, 56, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsq0(osq0 osq0Var, Function0 function0, int i) {
        super(2);
        this.b = osq0Var;
        this.c = function0;
    }
}
