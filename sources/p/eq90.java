package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eq90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tu8 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq90(tu8 tu8Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tu8Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        tu8 tu8Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                qxd0.A(tu8Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                qxd0.B(tu8Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
