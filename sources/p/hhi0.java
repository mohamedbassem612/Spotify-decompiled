package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hhi0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ igi0 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hhi0(igi0 igi0Var, iu30 iu30Var, j2i j2iVar, int i, float f, int i2, float f2, int i3, qim0 qim0Var, int i4, boolean z, j2i j2iVar2, int i5, int i6) {
        super(2);
        this.a = igi0Var;
        this.b = iu30Var;
        this.c = j2iVar;
        this.d = i;
        this.e = f;
        this.f = i2;
        this.g = f2;
        this.h = i3;
        this.i = qim0Var;
        this.t = i4;
        this.X = z;
        this.Y = j2iVar2;
        this.Z = i6;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(385);
        short s = this.Z;
        bro1.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, s);
        return rih1.a;
    }
}
