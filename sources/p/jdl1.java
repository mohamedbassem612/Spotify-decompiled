package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jdl1 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ pmg1 f;
    public final /* synthetic */ qim0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdl1(int i, boolean z, float f, float f2, boolean z2, pmg1 pmg1Var, qim0 qim0Var, int i2) {
        super(2);
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = z2;
        this.f = pmg1Var;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        kdl1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
        return rih1.a;
    }
}
