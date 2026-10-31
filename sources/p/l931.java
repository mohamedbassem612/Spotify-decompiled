package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l931 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja31 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l931(ja31 ja31Var, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = ja31Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        ja31 ja31Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    dzo1 dzo1VarC = ja31Var.g ? gqg0.c(ja31Var.i) : gqg0.c(ja31Var.h);
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        us21 us21Var = new us21(function0, (byte) 7);
                        x340Var2.s0(us21Var);
                        obj3 = us21Var;
                    }
                    obj3 = objT;
                    wro1.h(new gbx(dzo1VarC, (Function0) obj3), ldx.c, (qim0) null, (max) null, (gdx) null, zzq0Var, false, (idn0) null, (ga80) null, apo.r(-1465522547, new ps11(ja31Var, (byte) 21), x340Var2), x340Var2, 0, 6, 956);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    bzn1.e((qim0) null, xdj.a, false, apo.r(-945477130, new l931(ja31Var, function0, z ? 1 : 0), x340Var4), rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 3120, 229);
                }
                break;
        }
        return rih1Var;
    }
}
