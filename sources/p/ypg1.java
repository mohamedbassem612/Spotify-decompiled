package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ypg1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ kjs b;
    public final /* synthetic */ sqe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypg1(kjs kjsVar, sqe sqeVar) {
        super(2);
        this.b = kjsVar;
        this.c = sqeVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sqe sqeVar = this.c;
        kjs kjsVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                kjsVar.a(sqeVar, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    kjsVar.a(sqeVar, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypg1(kjs kjsVar, sqe sqeVar, int i) {
        super(2);
        this.b = kjsVar;
        this.c = sqeVar;
    }
}
