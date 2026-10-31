package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yqj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ arj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqj0(arj0 arj0Var, byte b) {
        super(1);
        this.a = b;
        this.b = arj0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        arj0 arj0Var = this.b;
        switch (b) {
            case 0:
                return new k6r(arj0Var, (byte) 27);
            case 1:
                grj0 grj0Var = new grj0(((Boolean) obj).booleanValue());
                if (arj0Var.l.compareAndSet(false, true)) {
                    arj0Var.j.b(grj0Var);
                    arj0Var.e.l();
                }
                return rih1Var;
            default:
                grj0 grj0Var2 = new grj0(((Boolean) obj).booleanValue());
                if (arj0Var.l.compareAndSet(false, true)) {
                    arj0Var.j.b(grj0Var2);
                    arj0Var.e.l();
                }
                return rih1Var;
        }
    }
}
