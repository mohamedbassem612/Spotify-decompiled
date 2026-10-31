package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jrg extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ krg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrg(krg krgVar) {
        super(2);
        this.b = krgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        krg krgVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fq7.g(krgVar.getState(), (qim0) null, xa4.q(), xa4.r(), (String) null, apo.r(317952481, new okg(krgVar, (byte) 3), x340Var2), x340Var2, 196608, 18);
                }
                break;
            default:
                ((Number) obj2).intValue();
                krgVar.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrg(krg krgVar, int i) {
        super(2);
        this.b = krgVar;
    }
}
