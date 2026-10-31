package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xwj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwj(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                txj.g((txj) obj4, (hwq) obj3, b0kVar, czo1.p(i | 1));
                break;
            default:
                cso1.x(czo1.p(i | 1), (String) obj4, b0kVar, (qim0) obj3);
                break;
        }
        return rih1Var;
    }
}
