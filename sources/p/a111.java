package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a111 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c111 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a111(c111 c111Var, byte b) {
        super(1);
        this.a = b;
        this.b = c111Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c111 c111Var = this.b;
        switch (b) {
            case 0:
                return c111Var.b;
            default:
                kly0 kly0Var = c111Var.c.a.a;
                return new z011(((t35) kly0Var.get()).n(), ((t35) kly0Var.get()).m(), 71);
        }
    }
}
