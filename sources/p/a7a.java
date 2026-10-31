package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a7a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d7a b;
    public final /* synthetic */ h8a c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7a(d7a d7aVar, h8a h8aVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = d7aVar;
        this.c = h8aVar;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        h8a h8aVar = this.c;
        d7a d7aVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                d7aVar.a(h8aVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                d7aVar.a(h8aVar, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
