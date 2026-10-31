package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ru61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ su61 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru61(su61 su61Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = su61Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        su61 su61Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    su61Var.a(i == 1, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    j2i j2iVarR = apo.r(13389513, new ru61(su61Var, i, b2), x340Var4);
                    boolean zI = x340Var4.i(su61Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new l451(su61Var, (byte) 28);
                        x340Var4.s0(objT);
                    }
                    bzn1.e((qim0) null, (vu30) null, false, j2iVarR, (sgr0) null, (ngr0) null, (ygr0) null, (Function0) objT, x340Var4, 3072, 119);
                }
                break;
        }
        return rih1Var;
    }
}
