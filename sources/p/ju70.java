package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ju70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lu70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju70(lu70 lu70Var, byte b) {
        super(1);
        this.a = b;
        this.b = lu70Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lu70 lu70Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(lu70Var.a, lu70Var.h, (mu70) obj);
            default:
                ((qtr) obj).b(new lcm(lu70Var, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
