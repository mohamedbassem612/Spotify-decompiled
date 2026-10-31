package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(n3 n3Var, byte b) {
        super(1);
        this.a = b;
        this.b = n3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n3 n3Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(n3Var.a, n3Var.t, (b3) obj);
            default:
                ((qtr) obj).b(new f3(n3Var, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
