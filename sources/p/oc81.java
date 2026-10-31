package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oc81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he81 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc81(he81 he81Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = he81Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        he81 he81Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                j7p1.j(he81Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                j7p1.k(he81Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
