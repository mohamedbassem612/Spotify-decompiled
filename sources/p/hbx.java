package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hbx extends hab0 implements vu30 {
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ ibx c;
    public final /* synthetic */ long d;
    public final /* synthetic */ a0e1 e;
    public final /* synthetic */ mhc0 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ s61 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hbx(String str, qim0 qim0Var, ibx ibxVar, long j, a0e1 a0e1Var, mhc0 mhc0Var, int i, boolean z, int i2, s61 s61Var, iu30 iu30Var, int i3, int i4) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = ibxVar;
        this.d = j;
        this.e = a0e1Var;
        this.f = mhc0Var;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.t = s61Var;
        this.X = iu30Var;
        this.Y = i3;
        this.Z = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        short s = this.Z;
        zmo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, s);
        return rih1.a;
    }
}
