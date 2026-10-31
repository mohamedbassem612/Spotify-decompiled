package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kv50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov50 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cxc0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv50(ov50 ov50Var, int i, cxc0 cxc0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = ov50Var;
        this.c = i;
        this.d = cxc0Var;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        cxc0 cxc0Var = this.d;
        int i2 = this.c;
        ov50 ov50Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ov50Var.b(i2, cxc0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                ov50Var.b(i2, cxc0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
