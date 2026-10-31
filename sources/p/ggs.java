package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ggs extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m8v0 b;
    public final /* synthetic */ tjq c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggs(m8v0 m8v0Var, tjq tjqVar, String str, byte b) {
        super(2);
        this.a = b;
        this.b = m8v0Var;
        this.c = tjqVar;
        this.d = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        tjq tjqVar = this.c;
        l8v0 l8v0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    l8v0 l8v0Var2 = l8v0Var;
                    boolean zI = x340Var2.i(tjqVar) | x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new nxr(tjqVar, str, (byte) 19);
                        x340Var2.s0(objT);
                    }
                    vqo1.e(l8v0Var2, (Function0) objT, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(14037655, new ggs(l8v0Var, tjqVar, str, b2), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
