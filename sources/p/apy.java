package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class apy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ loy b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apy(loy loyVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = loyVar;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        loy loyVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                wpb1.a(loyVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                wpb1.a(loyVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                wpb1.e(loyVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
