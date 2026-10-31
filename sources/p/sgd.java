package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sgd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sgd(hux huxVar, String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = str;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.e;
        qim0 qim0Var = this.d;
        String str = this.c;
        hux huxVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                xyn1.d(huxVar, str, qim0Var, b0kVar, czo1.p(b2 | 1));
                break;
            case 1:
                azo1.d(huxVar, str, qim0Var, b0kVar, czo1.p(b2 | 1));
                break;
            default:
                vvm1.n(huxVar, str, qim0Var, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }
}
