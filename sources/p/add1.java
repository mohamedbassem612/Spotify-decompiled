package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class add1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bdd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ add1(bdd1 bdd1Var, byte b) {
        super(1);
        this.a = b;
        this.b = bdd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bdd1 bdd1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(bdd1Var.a, bdd1Var.c, (xcd1) obj);
            default:
                ((qtr) obj).b(new bgb1(bdd1Var, (lnm) null, (byte) 2));
                return rih1.a;
        }
    }
}
