package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class thb1 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public thb1(int i, iu30 iu30Var, qim0 qim0Var, float f, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = f;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ozn1.j(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}
