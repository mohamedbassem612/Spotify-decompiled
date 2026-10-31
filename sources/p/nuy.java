package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nuy extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ouy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuy(ouy ouyVar) {
        super(2);
        this.b = ouyVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ouy ouyVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ouyVar.d((b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zI = x340Var2.i(ouyVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new pdy(ouyVar, (byte) 4);
                        x340Var2.s0(objT);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, pmi.a, x340Var2, 0, 6, 1020);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuy(ouy ouyVar, int i) {
        super(2);
        this.b = ouyVar;
    }
}
