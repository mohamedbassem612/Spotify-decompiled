package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oel1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dpo b;
    public final /* synthetic */ ijf1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ pmg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oel1(dpo dpoVar, ijf1 ijf1Var, float f, pmg1 pmg1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = dpoVar;
        this.c = ijf1Var;
        this.d = f;
        this.e = pmg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                pmg1 pmg1Var = this.e;
                int iP = czo1.p(49);
                b2u.h(this.b, this.c, this.d, pmg1Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                pmg1 pmg1Var2 = this.e;
                int iP2 = czo1.p(49);
                b2u.h(this.b, this.c, this.d, pmg1Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                pmg1 pmg1Var3 = this.e;
                int iP3 = czo1.p(49);
                b2u.h(this.b, this.c, this.d, pmg1Var3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
