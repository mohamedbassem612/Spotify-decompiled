package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hjd0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hjd0(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, iu30 iu30Var, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str3;
        this.i = iu30Var;
        this.t = qim0Var;
        this.X = i2;
        this.Y = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        m0p1.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1), this.Y);
        return rih1.a;
    }
}
