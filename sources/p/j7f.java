package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j7f extends hab0 implements vu30 {
    public final /* synthetic */ j2i a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ zqo1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ kuo1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j7f(j2i j2iVar, qim0 qim0Var, zqo1 zqo1Var, boolean z, vu30 vu30Var, vu30 vu30Var2, kuo1 kuo1Var, int i, int i2) {
        super(2);
        this.a = j2iVar;
        this.b = qim0Var;
        this.c = zqo1Var;
        this.d = z;
        this.e = vu30Var;
        this.f = vu30Var2;
        this.g = kuo1Var;
        this.h = i;
        this.i = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rqo1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}
