package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bn20 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ dn20 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ yqg d;
    public final /* synthetic */ xu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn20(dn20 dn20Var, iu30 iu30Var, yqg yqgVar, xu30 xu30Var) {
        super(2);
        this.b = dn20Var;
        this.c = iu30Var;
        this.d = yqgVar;
        this.e = xu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                o2p1.b(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    o2p1.b(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn20(dn20 dn20Var, iu30 iu30Var, yqg yqgVar, xu30 xu30Var, int i) {
        super(2);
        this.b = dn20Var;
        this.c = iu30Var;
        this.d = yqgVar;
        this.e = xu30Var;
    }
}
