package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y121 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a221 b;
    public final /* synthetic */ m0u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y121(a221 a221Var, m0u m0uVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = a221Var;
        this.c = m0uVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m0u m0uVar = this.c;
        a221 a221Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                a221Var.e(m0uVar, b0kVar, czo1.p(1));
                break;
            default:
                a221Var.f(m0uVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
