package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s990 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s990(int i, int i2, qim0 qim0Var, float f, float f2, float f3, int i3) {
        super(2);
        this.a = i;
        this.b = i2;
        this.c = qim0Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        bin.b(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
        return rih1.a;
    }
}
