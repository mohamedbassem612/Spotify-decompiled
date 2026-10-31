package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fk0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk0(jkr0 jkr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jkr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jkr0 jkr0Var = this.b;
        switch (b) {
            case 0:
                b261.k((e261) obj, new d4h(1, jkr0Var.l()));
                break;
            default:
                ((kd31) obj).b(yoi1.o(1.0f - (Math.abs(((drr0) jkr0Var.d.d).s()) * 3.0f), 0.0f, 1.0f));
                break;
        }
        return rih1Var;
    }
}
