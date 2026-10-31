package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pvx extends hab0 implements vu30 {
    public final /* synthetic */ tvx a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xu30 d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvx(tvx tvxVar, int i, float f, xu30 xu30Var, xu30 xu30Var2, int i2) {
        super(2);
        this.a = tvxVar;
        this.b = i;
        this.c = f;
        this.d = xu30Var;
        this.e = xu30Var2;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        jto1.e(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1));
        return rih1.a;
    }
}
