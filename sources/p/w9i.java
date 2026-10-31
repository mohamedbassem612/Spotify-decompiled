package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w9i extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gwb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9i(gwb gwbVar, byte b) {
        super(2);
        this.a = b;
        this.b = gwbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gwb gwbVar = this.b;
        switch (b) {
            case 0:
                return new u7h(gwbVar.c);
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(gwbVar.a.a, isl.a, (qim0) null, gwbVar.b, 0L, false, x340Var2, 56, 52);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var4, gwbVar.a.b), (qim0) null, (lee1) null, gwbVar.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var4, 0, 0, 1782);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
