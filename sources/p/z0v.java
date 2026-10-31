package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z0v extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p0v b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0v(p0v p0vVar, String str, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = p0vVar;
        this.c = str;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        String str = this.c;
        p0v p0vVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                qxy0.p(p0vVar, str, iu30Var, b0kVar, czo1.p(1));
                break;
            default:
                qxy0.p(p0vVar, str, iu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
