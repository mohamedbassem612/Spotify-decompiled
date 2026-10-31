package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v6k extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ cr31 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v6k(float f, float f2, qim0 qim0Var, cr31 cr31Var, String str, int i, int i2) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = qim0Var;
        this.d = cr31Var;
        this.e = str;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(24577);
        byte b = this.f;
        w6k.f(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP, b);
        return rih1.a;
    }
}
