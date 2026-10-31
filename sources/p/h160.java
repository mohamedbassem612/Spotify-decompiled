package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h160 extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h160(qim0 qim0Var, float f, float f2, vu30 vu30Var, int i, int i2) {
        super(2);
        this.a = qim0Var;
        this.b = f;
        this.c = f2;
        this.d = vu30Var;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l4o1.e(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}
