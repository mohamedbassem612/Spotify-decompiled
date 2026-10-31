package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cfj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cfj1(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(hw2Var.b, hw2Var.c, (yej1) obj);
            default:
                ((qtr) obj).b(new efj1(hw2Var, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
