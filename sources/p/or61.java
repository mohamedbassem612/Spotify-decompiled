package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class or61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ if5 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ lax d;
    public final /* synthetic */ hux e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ or61(if5 if5Var, qim0 qim0Var, lax laxVar, hux huxVar, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = if5Var;
        this.c = qim0Var;
        this.d = laxVar;
        this.e = huxVar;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                cso1.s(this.b, this.c, this.d, this.e, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                cso1.s(this.b, this.c, this.d, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
