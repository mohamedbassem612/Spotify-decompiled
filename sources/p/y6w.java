package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y6w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6w(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case 0:
                b7w b7wVar = (b7w) obj;
                return hu20.e(d3p1.F(hw2Var.b, hw2Var.c, b7wVar), new qd0((lnm) null, hw2Var, b7wVar, (byte) 15));
            default:
                ((qtr) obj).b(new lu(hw2Var, (lnm) null, (byte) 28));
                return rih1.a;
        }
    }
}
