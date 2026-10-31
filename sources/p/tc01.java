package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tc01 extends hab0 implements iu30 {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ yae1 c;
    public final /* synthetic */ bw91 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ed01 g;
    public final /* synthetic */ lee1 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc01(c9n c9nVar, ven0 ven0Var, yae1 yae1Var, bw91 bw91Var, int i, int i2, ed01 ed01Var, lee1 lee1Var, int i3, ven0 ven0Var2) {
        super(1);
        this.a = c9nVar;
        this.b = ven0Var;
        this.c = yae1Var;
        this.d = bw91Var;
        this.e = i;
        this.f = i2;
        this.g = ed01Var;
        this.h = lee1Var;
        this.i = i3;
        this.t = ven0Var2;
    }

    public final Object invoke(Object obj) {
        yr80 yr80Var = (yr80) obj;
        long j = yr80Var.a;
        ven0 ven0Var = this.b;
        if (!yr80.b(j, ((yr80) ven0Var.getValue()).a)) {
            ven0Var.setValue(yr80Var);
            fn31.T(this.a, (o8n) null, 0, new sc01(this.c, this.d, this.e, this.f, this.g, this.b, this.h, this.i, this.t, null, (byte) 1), 3);
        }
        return rih1.a;
    }
}
