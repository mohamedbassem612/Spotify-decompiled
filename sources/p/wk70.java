package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wk70 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ q10 d;
    public final /* synthetic */ gt40 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wk70(int i, long j, String str, q10 q10Var, gt40 gt40Var, long j2, boolean z, float f, float f2, int i2, int i3, int i4) {
        super(2);
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = q10Var;
        this.e = gt40Var;
        this.f = j2;
        this.g = z;
        this.h = f;
        this.i = f2;
        this.t = i2;
        this.X = i3;
        this.Y = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        short s = this.Y;
        czo1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
        return rih1.a;
    }
}
