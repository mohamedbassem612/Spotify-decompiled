package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jg7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mg7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg7(mg7 mg7Var, byte b) {
        super(2);
        this.a = b;
        this.b = mg7Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        mg7 mg7Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2i j2iVar = k7i.a;
                    sgr0 sgr0Var = (sgr0) mg7Var.Q0.getValue();
                    boolean zI = x340Var2.i(mg7Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        obj3 = objT;
                        i26 i26Var = new i26(mg7Var, (byte) 15);
                        x340Var2.s0(i26Var);
                        obj3 = i26Var;
                    }
                    obj3 = objT;
                    bzn1.e((qim0) null, j2iVar, false, (vu30) null, sgr0Var, (ngr0) null, (ygr0) null, (Function0) obj3, x340Var2, 48, 109);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    qsw.c(new obk1(mg7Var.g), apo.r(-363406385, new jg7(mg7Var, false ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-457367186, new jg7(mg7Var, b2), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                r820 r820Var = (r820) obj;
                if (r820Var instanceof q820) {
                    q820 q820Var = (q820) r820Var;
                    mg7Var.O0.invoke(q820Var.a, Integer.valueOf(q820Var.b));
                    return rih1Var;
                }
                if (r820Var instanceof p820) {
                    mg7Var.O0.invoke(r620.TOP, 0);
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
