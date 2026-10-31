package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j3g extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m3g b;
    public final /* synthetic */ cxc0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3g(m3g m3gVar, cxc0 cxc0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = m3gVar;
        this.c = cxc0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        cxc0 cxc0Var = this.c;
        m3g m3gVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                m3gVar.e(cxc0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                m3gVar.e(cxc0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
