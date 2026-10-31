package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tqa extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fi90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqa(fi90 fi90Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = fi90Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fi90 fi90Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                pap1.i(fi90Var, b0kVar, czo1.p(1));
                break;
            default:
                c4p1.j(fi90Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
