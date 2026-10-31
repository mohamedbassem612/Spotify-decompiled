package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ahx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahx(vu30 vu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = vu30Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        vu30 vu30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                iqo1.a(czo1.p(i | 1), b0kVar, vu30Var, qim0Var);
                break;
            case 1:
                iqo1.e(czo1.p(i | 1), b0kVar, vu30Var, qim0Var);
                break;
            case 2:
                iqo1.l(czo1.p(i | 1), b0kVar, vu30Var, qim0Var);
                break;
            case 3:
                u4p1.a(czo1.p(i | 1), b0kVar, vu30Var, qim0Var);
                break;
            default:
                u4p1.a(czo1.p(i | 1), b0kVar, vu30Var, qim0Var);
                break;
        }
        return rih1Var;
    }
}
