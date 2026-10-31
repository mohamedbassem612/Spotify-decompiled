package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iwx extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iwx(float f, qim0 qim0Var, long j, long j2, int i, int i2) {
        super(2);
        this.a = f;
        this.b = qim0Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.e | 1);
        byte b = this.f;
        tto1.d(this.a, iP, b, this.c, this.d, (b0k) obj, this.b);
        return rih1.a;
    }
}
