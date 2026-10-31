package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p61 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ s61 X;
    public final /* synthetic */ Integer Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ a0e1 e;
    public final /* synthetic */ mhc0 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p61(String str, qim0 qim0Var, lee1 lee1Var, long j, a0e1 a0e1Var, mhc0 mhc0Var, int i, boolean z, int i2, iu30 iu30Var, s61 s61Var, Integer num, int i3, int i4) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = lee1Var;
        this.d = j;
        this.e = a0e1Var;
        this.f = mhc0Var;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.t = iu30Var;
        this.X = s61Var;
        this.Y = num;
        this.Z = i3;
        this.N0 = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        r61.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
