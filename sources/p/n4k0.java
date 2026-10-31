package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n4k0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4k0 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4k0(r4k0 r4k0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r4k0Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        r4k0 r4k0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                r4k0Var.c(qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                r4k0Var.g(qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
