package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vu9 extends hab0 implements vu30 {
    public final /* synthetic */ be50 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ xo30 c;
    public final /* synthetic */ p3v d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu9(be50 be50Var, long j, xo30 xo30Var, p3v p3vVar, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        this.a = be50Var;
        this.b = j;
        this.c = xo30Var;
        this.d = p3vVar;
        this.e = j2iVar;
        this.f = qim0Var;
        this.g = i;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        e4p1.g(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1));
        return rih1.a;
    }
}
