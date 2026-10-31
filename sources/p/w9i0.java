package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9i0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z9i0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9i0(z9i0 z9i0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z9i0Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        z9i0 z9i0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                boo1.j(z9i0Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                boo1.k(z9i0Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
