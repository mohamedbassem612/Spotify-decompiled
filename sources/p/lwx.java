package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lwx extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ short d;
    public final /* synthetic */ db80 e;
    public final /* synthetic */ short f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lwx(float f, qim0 qim0Var, long j, int i, db80 db80Var, int i2, int i3) {
        super(2);
        this.a = f;
        this.b = qim0Var;
        this.c = j;
        this.d = i;
        this.e = db80Var;
        this.f = i2;
        this.g = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yto1.d(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1), this.g);
        return rih1.a;
    }
}
