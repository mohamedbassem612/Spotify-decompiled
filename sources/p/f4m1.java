package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f4m1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i4m1 b;
    public final /* synthetic */ zxl1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4m1(i4m1 i4m1Var, zxl1 zxl1Var, byte b) {
        super(2);
        this.a = b;
        this.b = i4m1Var;
        this.c = zxl1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    i4m1 i4m1Var = this.b;
                    g2m1 g2m1Var = i4m1Var.i;
                    b2m1 b2m1Var = i4m1Var.j;
                    los losVar = i4m1Var.g;
                    zxl1 zxl1Var = this.c;
                    boolean zI = x340Var2.i(zxl1Var) | x340Var2.i(i4m1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new g4k1(zxl1Var, i4m1Var, (byte) 12);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI2 = x340Var2.i(i4m1Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        zgl1 zgl1Var = new zgl1(1, i4m1Var, i4m1.class, "setDismissBlocked", "setDismissBlocked(Z)V", 0, (byte) 5);
                        x340Var2.s0(zgl1Var);
                        objT2 = zgl1Var;
                    }
                    wpb1.m(g2m1Var, b2m1Var, zxl1Var, losVar, function0, (iu30) objT2, i4m1Var.k.s(), (qim0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    wpb1.o(this.b.j, this.c, (qim0) null, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
