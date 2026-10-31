package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e760 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ esv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e760(esv0 esv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = esv0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        esv0 esv0Var = this.b;
        switch (b) {
            case 0:
                esv0Var.invoke(cw70.a);
                break;
            default:
                esv0Var.invoke(cw70.b);
                break;
        }
        return rih1Var;
    }
}
