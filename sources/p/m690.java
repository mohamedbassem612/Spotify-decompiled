package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m690 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t2j0 b;
    public final /* synthetic */ b6h1 c;
    public final /* synthetic */ t380 d;
    public final /* synthetic */ s7h1 e;
    public final /* synthetic */ m8h1 f;
    public final /* synthetic */ yqg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m690(t2j0 t2j0Var, b6h1 b6h1Var, t380 t380Var, s7h1 s7h1Var, m8h1 m8h1Var, yqg yqgVar, byte b) {
        super(1);
        this.a = b;
        this.b = t2j0Var;
        this.c = b6h1Var;
        this.d = t380Var;
        this.e = s7h1Var;
        this.f = m8h1Var;
        this.g = yqgVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b6h1 b6h1Var = this.c;
        switch (b) {
            case 0:
                rj41 rj41Var = (rj41) obj;
                return new k8h1(this.b, (v6h1) b6h1Var.a(rj41Var), this.d, this.e, this.f, this.g, rj41Var, false);
            default:
                rj41 rj41Var2 = (rj41) obj;
                return new k8h1(this.b, (v6h1) b6h1Var.a(rj41Var2), this.d, this.e, this.f, this.g, rj41Var2, true);
        }
    }
}
