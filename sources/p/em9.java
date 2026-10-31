package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class em9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gm9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em9(gm9 gm9Var, byte b) {
        super(1);
        this.a = b;
        this.b = gm9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gm9 gm9Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(gm9Var.b, gm9Var.d, (bm9) obj);
            case 1:
                return new cm9(((Number) gm9Var.c.i.a.getValue()).floatValue(), "", "", (String) null, ((bm9) obj).c, false);
            default:
                ((qtr) obj).b(new kr(gm9Var, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
