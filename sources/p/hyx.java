package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hyx extends hab0 implements vu30 {
    public final /* synthetic */ short N0;
    public final /* synthetic */ qx8 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ a0e1 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ djc0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hyx(String str, qim0 qim0Var, lee1 lee1Var, long j, a0e1 a0e1Var, iu30 iu30Var, int i, boolean z, djc0 djc0Var, int i2, qx8 qx8Var, int i3, int i4, int i5) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = lee1Var;
        this.d = j;
        this.e = a0e1Var;
        this.f = iu30Var;
        this.g = i;
        this.h = z;
        this.i = djc0Var;
        this.t = i2;
        this.X = qx8Var;
        this.Y = i3;
        this.Z = i4;
        this.N0 = i5;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        short s = this.N0;
        uwo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
