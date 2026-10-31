package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ran0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ san0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ran0(san0 san0Var, byte b) {
        super(1);
        this.a = b;
        this.b = san0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        san0 san0Var = this.b;
        switch (b) {
            case 0:
                gey0 gey0Var = (gey0) obj;
                return new x010(d3p1.H(san0Var.d, san0Var.e, gey0Var), san0Var.c.E(gey0Var.a), new lok0(3, lnmVar, (byte) 4), (byte) 1);
            default:
                ((qtr) obj).b(new lcm(san0Var, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
