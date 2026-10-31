package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kwx extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kwx(float f, int i, int i2, int i3, long j, long j2, qim0 qim0Var) {
        super(2);
        this.a = f;
        this.b = qim0Var;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.g = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.f | 1);
        byte b = this.g;
        xto1.f(this.a, this.c, iP, b, this.d, this.e, (b0k) obj, this.b);
        return rih1.a;
    }
}
