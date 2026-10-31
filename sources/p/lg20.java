package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lg20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg20(ng20 ng20Var, byte b) {
        super(1);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ng20 ng20Var = this.b;
        switch (b) {
            case 0:
                fg60 fg60Var = (fg60) ng20Var.c;
                return new x010(fg60Var.a, fg60Var.e, new ce2(3, (lnm) null, (byte) 18), (byte) 1);
            case 1:
                fg60 fg60Var2 = (fg60) ng20Var.c;
                return new kg20(fg60Var2.b() && ((Boolean) fg60Var2.e.a.getValue()).booleanValue());
            default:
                ((qtr) obj).b(new skv(ng20Var, null, (byte) 7));
                return rih1.a;
        }
    }
}
