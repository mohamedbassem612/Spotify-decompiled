package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vck0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vck0(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                return new x010(d3p1.H(el9Var.b, el9Var.c, (rck0) obj), ((bbk0) el9Var.t).b(), new vv70(3, (lnm) null, (byte) 25), (byte) 1);
            default:
                ((qtr) obj).b(new psm(el9Var, null, (byte) 2));
                return rih1.a;
        }
    }
}
