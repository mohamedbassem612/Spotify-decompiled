package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class plf0 extends hab0 implements vu30 {
    public final /* synthetic */ short N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ bmf0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public plf0(bmf0 bmf0Var, boolean z, boolean z2, float f, int i, boolean z3, qim0 qim0Var, boolean z4, boolean z5, Boolean bool, boolean z6, iu30 iu30Var, int i2, int i3) {
        super(2);
        this.a = bmf0Var;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = i;
        this.f = z3;
        this.g = qim0Var;
        this.h = z4;
        this.i = z5;
        this.t = bool;
        this.X = z6;
        this.Y = iu30Var;
        this.Z = i2;
        this.N0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        short s = this.N0;
        wlf0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, s);
        return rih1.a;
    }
}
