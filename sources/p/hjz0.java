package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hjz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jjz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hjz0(jjz0 jjz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jjz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jjz0 jjz0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(jjz0Var.a, jjz0Var.d, (fjz0) obj);
            default:
                ((qtr) obj).b(new pnp0(jjz0Var, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
