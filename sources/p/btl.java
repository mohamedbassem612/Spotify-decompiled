package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class btl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ btl(byte b, float f, float f2, int i, Object obj, Object obj2) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ctl.d((dtl) obj4, (iuj) obj3, this.b, this.c, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ((vkj1) obj4).e((rk41) obj3, this.b, this.c, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
