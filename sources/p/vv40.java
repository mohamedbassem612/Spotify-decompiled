package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vv40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bor0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv40(bor0 bor0Var, qim0 qim0Var, float f, float f2, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = bor0Var;
        this.c = qim0Var;
        this.d = f;
        this.e = f2;
        this.f = j2iVar;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                fn31.d(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                fn31.d(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
