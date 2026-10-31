package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x5m1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cxc0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5m1(cxc0 cxc0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = cxc0Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        cxc0 cxc0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                obg1.m(cxc0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                obg1.m(cxc0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
