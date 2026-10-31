package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class csl extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ d0r b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ qxl d;
    public final /* synthetic */ j2i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csl(d0r d0rVar, qim0 qim0Var, qxl qxlVar, j2i j2iVar) {
        super(2);
        this.b = d0rVar;
        this.c = qim0Var;
        this.d = qxlVar;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                men1.c(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(196609));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    x340Var2.i0(1475675779);
                    x340Var2.r(false);
                    men1.c(this.b, this.c, this.d, apo.r(-353810784, new pu2(this.e, (byte) 15), x340Var2), x340Var2, 196608);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csl(d0r d0rVar, qim0 qim0Var, qxl qxlVar, j2i j2iVar, int i) {
        super(2);
        this.b = d0rVar;
        this.c = qim0Var;
        this.d = qxlVar;
        this.e = j2iVar;
    }
}
