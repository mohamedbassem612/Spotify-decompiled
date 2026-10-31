package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b7v extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ss50 f;
    public final /* synthetic */ xtb0 g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7v(int i, int i2, int i3, ven0 ven0Var, ven0 ven0Var2, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var3) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ss50Var;
        this.g = xtb0Var;
        this.h = ven0Var3;
    }

    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        ven0 ven0Var = this.d;
        fde1 fde1Var = fde1.b;
        ven0Var.setValue(fde1Var);
        int iU = jch0.U(fFloatValue);
        int i = this.a;
        int i2 = this.b;
        bs51.d(this.e, this.f, this.g, this.h, new oz(fde1Var, yoi1.p(i - iU, i2, i), i2, this.c));
        return rih1.a;
    }
}
