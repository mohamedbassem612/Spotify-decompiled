package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g6j0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ long c;
    public final /* synthetic */ hwi0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ Integer h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g6j0(int i, hux huxVar, long j, hwi0 hwi0Var, float f, float f2, qim0 qim0Var, Integer num, boolean z, float f3, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = huxVar;
        this.c = j;
        this.d = hwi0Var;
        this.e = f;
        this.f = f2;
        this.g = qim0Var;
        this.h = num;
        this.i = z;
        this.t = f3;
        this.X = i2;
        this.Y = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        short s = this.Y;
        yxo1.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
        return rih1.a;
    }
}
