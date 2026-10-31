package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sp6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zp6 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp6(zp6 zp6Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = zp6Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        zp6 zp6Var = this.b;
        boolean z = false;
        byte b2 = 2;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    yp6 yp6Var = (yp6) zp6Var;
                    String str = yp6Var.b;
                    String str2 = yp6Var.d;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        ge3 ge3Var = new ge3(iu30Var, (byte) 16);
                        x340Var2.s0(ge3Var);
                        obj3 = ge3Var;
                    }
                    obj3 = objT;
                    zko1.a(0, str, str2, (Function0) obj3, x340Var2, (qim0) null);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    gfx.b(2, apo.r(-608386568, new sp6(zp6Var, iu30Var, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 54);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    yp6 yp6Var2 = (yp6) zp6Var;
                    String str3 = yp6Var2.b;
                    String str4 = yp6Var2.d;
                    boolean zG2 = x340Var6.g(iu30Var);
                    Object objT2 = x340Var6.T();
                    if (zG2 || objT2 == fkj0.X) {
                        obj4 = objT2;
                        ge3 ge3Var2 = new ge3(iu30Var, (byte) 17);
                        x340Var6.s0(ge3Var2);
                        obj4 = ge3Var2;
                    }
                    obj4 = objT2;
                    zko1.a(0, str3, str4, (Function0) obj4, x340Var6, (qim0) null);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    gfx.b(2, apo.r(1825701240, new sp6(zp6Var, iu30Var, b2), x340Var8), x340Var8, 54);
                }
                break;
        }
        return rih1Var;
    }
}
