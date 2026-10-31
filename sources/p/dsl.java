package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dsl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsl b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ qxl e;
    public final /* synthetic */ j2i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsl(gsl gslVar, d0r d0rVar, qim0 qim0Var, qxl qxlVar, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = gslVar;
        this.c = d0rVar;
        this.d = qim0Var;
        this.e = qxlVar;
        this.f = j2iVar;
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
                    this.b.b.b(70, apo.r(2146784574, new csl(this.c, this.d, this.e, this.f), x340Var2), x340Var2);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.a(apo.r(1172075390, new dsl(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
