package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i1i1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xyh1 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1i1(xyh1 xyh1Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xyh1Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        xyh1 xyh1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                qmo1.j(xyh1Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                qmo1.k(xyh1Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
