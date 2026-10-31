package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class egy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fgy b;
    public final /* synthetic */ ksw c;
    public final /* synthetic */ cgy d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egy(fgy fgyVar, ksw kswVar, cgy cgyVar, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = fgyVar;
        this.c = kswVar;
        this.d = cgyVar;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fgy fgyVar = this.b;
                    c921.c(fgyVar.d, fgyVar.e, fgyVar.b, fgyVar.g, fgyVar.f.b(5), this.c, this.d, this.e, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = oi7.a;
                    fgy fgyVar2 = this.b;
                    mod.b(kivVar.a(fgyVar2.c), apo.r(-2015844887, new egy(fgyVar2, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }
}
