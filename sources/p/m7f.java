package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m7f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ kuo1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7f(vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, qim0 qim0Var, kuo1 kuo1Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = vu30Var;
        this.c = j2iVar;
        this.d = vu30Var2;
        this.e = qim0Var;
        this.f = kuo1Var;
        this.g = z;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                rqo1.k(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                rqo1.l(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
