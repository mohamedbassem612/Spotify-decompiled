package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class it00 implements vu30 {
    public final /* synthetic */ nt00 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zen0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ es41 f;
    public final /* synthetic */ hw61 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ j2i t;

    public it00(nt00 nt00Var, qim0 qim0Var, boolean z, zen0 zen0Var, ven0 ven0Var, es41 es41Var, hw61 hw61Var, long j, float f, j2i j2iVar) {
        this.a = nt00Var;
        this.b = qim0Var;
        this.c = z;
        this.d = zen0Var;
        this.e = ven0Var;
        this.f = es41Var;
        this.g = hw61Var;
        this.h = j;
        this.i = f;
        this.t = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            nt00 nt00Var = this.a;
            guo1.e(j9k1.x(this.b, new mt00(this.c, nt00Var.j, nt00Var.k)), this.d, this.e, this.f, this.g, this.h, this.i, this.t, x340Var2, 384);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
