package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pcx extends hab0 implements xu30 {
    public final /* synthetic */ flb0 a;
    public final /* synthetic */ u390 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ j2i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcx(flb0 flb0Var, u390 u390Var, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var, j2i j2iVar) {
        super(3);
        this.a = flb0Var;
        this.b = u390Var;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = vu30Var;
        this.t = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            mod.b(t4k.n.a(this.a), apo.r(-2128807433, new ncx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
