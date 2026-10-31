package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class esl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ gsl c;
    public final /* synthetic */ d0r d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ qxl f;
    public final /* synthetic */ j2i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esl(cir0 cir0Var, gsl gslVar, d0r d0rVar, qim0 qim0Var, qxl qxlVar, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = cir0Var;
        this.c = gslVar;
        this.d = d0rVar;
        this.e = qim0Var;
        this.f = qxlVar;
        this.g = j2iVar;
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
                    rce0.a(cwl1.B(this.b.g()), apo.r(918378109, new dsl(this.c, this.d, this.e, this.f, this.g, (byte) 1), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    cir0 cir0Var = this.b;
                    k2r0.a(cir0Var, apo.r(-360718708, new esl(cir0Var, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
