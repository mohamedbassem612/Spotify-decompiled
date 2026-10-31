package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nkk0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nkk0(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                return new x010(d3p1.H(el9Var.b, el9Var.c, (jkk0) obj), ((bbk0) el9Var.i).b(), new vv70(3, (lnm) null, (byte) 27), (byte) 1);
            case 1:
                ((qtr) obj).b(new eri0((avl1) el9Var, (lnm) null, (byte) 3));
                return rih1Var;
            default:
                ((drr0) el9Var.X).t(((Number) obj).floatValue());
                return rih1Var;
        }
    }
}
