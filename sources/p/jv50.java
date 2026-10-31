package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jv50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv50(ne91 ne91Var, byte b) {
        super(3);
        this.a = b;
        this.b = ne91Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rih1 rih1Var;
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        ne91 ne91Var = this.b;
        switch (b) {
            case 0:
                yyq yyqVar = (yyq) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                xu30 xu30Var = ne91Var.c;
                rih1 rih1Var3 = null;
                if (xu30Var == null) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(-539503564);
                    x340Var3.r(false);
                    rih1Var = null;
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(1922259309);
                    xu30Var.invoke(yyqVar, x340Var4, Integer.valueOf(iIntValue & 14));
                    x340Var4.r(false);
                    rih1Var = rih1Var2;
                }
                if (rih1Var == null) {
                    x340 x340Var5 = x340Var2;
                    x340Var5.i0(-539442338);
                    vu30 vu30Var = ne91Var.b;
                    if (vu30Var == null) {
                        x340Var5.i0(-539442339);
                        x340Var5.r(false);
                    } else {
                        c13.o(x340Var5, 1922261284, 0, vu30Var, x340Var5);
                        x340Var5.r(false);
                        rih1Var3 = rih1Var2;
                    }
                    x340Var5.r(false);
                    rih1Var = rih1Var3;
                } else {
                    x340 x340Var6 = x340Var2;
                    x340Var6.i0(1922258463);
                    x340Var6.r(false);
                }
                if (rih1Var == null) {
                    x340Var = x340Var2;
                    x340Var.i0(1922262056);
                    ujo1.i(x340Var, 0);
                } else {
                    x340Var = x340Var2;
                    x340Var.i0(1922258491);
                }
                x340Var.r(false);
                break;
            default:
                yyq yyqVar2 = (yyq) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                xu30 xu30Var2 = ne91Var.c;
                x340 x340Var7 = (b0k) obj2;
                if (xu30Var2 == null) {
                    x340Var7.i0(1810842256);
                } else {
                    x340Var7.i0(-1327059055);
                    xu30Var2.invoke(yyqVar2, x340Var7, Integer.valueOf(iIntValue2 & 14));
                }
                x340Var7.r(false);
                break;
        }
        return rih1Var2;
    }
}
