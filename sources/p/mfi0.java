package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mfi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lfi0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mfi0(lfi0 lfi0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = lfi0Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        lfi0 lfi0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fqo1.p(lfi0Var, z, b0kVar, czo1.p(1));
                break;
            case 1:
                fqo1.p(lfi0Var, z, b0kVar, czo1.p(1));
                break;
            default:
                fqo1.r(lfi0Var, z, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
