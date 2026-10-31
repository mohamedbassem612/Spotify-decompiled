package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oqm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ rqm0 b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ l7p d;
    public final /* synthetic */ h0p e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqm0(rqm0 rqm0Var, d0r d0rVar, l7p l7pVar, h0p h0pVar) {
        super(2);
        this.b = rqm0Var;
        this.c = d0rVar;
        this.d = l7pVar;
        this.e = h0pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                yah0.c(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    yah0.c(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqm0(rqm0 rqm0Var, d0r d0rVar, l7p l7pVar, h0p h0pVar, int i) {
        super(2);
        this.b = rqm0Var;
        this.c = d0rVar;
        this.d = l7pVar;
        this.e = h0pVar;
    }
}
