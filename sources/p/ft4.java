package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ft4 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ zen0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ es41 d;
    public final /* synthetic */ hw61 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j2i h;

    public ft4(qim0 qim0Var, zen0 zen0Var, ven0 ven0Var, es41 es41Var, hw61 hw61Var, long j, float f, j2i j2iVar) {
        this.a = qim0Var;
        this.b = zen0Var;
        this.c = ven0Var;
        this.d = es41Var;
        this.e = hw61Var;
        this.f = j;
        this.g = f;
        this.h = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            guo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, x340Var2, 384);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
