package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ouq0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ u7h c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ djc0 i;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ouq0(String str, qim0 qim0Var, u7h u7hVar, lee1 lee1Var, long j, float f, float f2, float f3, djc0 djc0Var, int i, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = u7hVar;
        this.d = lee1Var;
        this.e = j;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = djc0Var;
        this.t = i;
        this.X = i2;
        this.Y = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        short s = this.Y;
        w6d1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
        return rih1.a;
    }
}
