package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p3b1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q3b1 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p3b1(q3b1 q3b1Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = q3b1Var;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        j2i j2iVar = this.c;
        q3b1 q3b1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                q3b1Var.a(czo1.p(b2 | 1), j2iVar, b0kVar);
                break;
            default:
                q3b1Var.b(czo1.p(b2 | 1), j2iVar, b0kVar);
                break;
        }
        return rih1Var;
    }
}
