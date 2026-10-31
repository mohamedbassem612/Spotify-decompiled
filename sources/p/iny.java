package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iny extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iny(int i, float f, qim0 qim0Var, boolean z, float f2, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = f;
        this.c = qim0Var;
        this.d = z;
        this.e = f2;
        this.f = i2;
        this.g = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        z1a1.c(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1), this.g);
        return rih1.a;
    }
}
