package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hos extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ xb71 Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ ib71 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ u7h i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hos(int i, long j, long j2, qim0 qim0Var, ib71 ib71Var, boolean z, float f, float f2, u7h u7hVar, String str, String str2, String str3, xb71 xb71Var, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = qim0Var;
        this.e = ib71Var;
        this.f = z;
        this.g = f;
        this.h = f2;
        this.i = u7hVar;
        this.t = str;
        this.X = str2;
        this.Y = str3;
        this.Z = xb71Var;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.N0 | 1);
        short s = this.O0;
        z8p1.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP, s);
        return rih1.a;
    }
}
