package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kcc extends hab0 implements vu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kcc(c380 c380Var, qim0 qim0Var, lee1 lee1Var, long j, float f, int i, int i2) {
        super(2);
        this.a = c380Var;
        this.b = qim0Var;
        this.c = lee1Var;
        this.d = j;
        this.e = f;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        op71.a(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1), this.g);
        return rih1.a;
    }
}
