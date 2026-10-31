package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iqm0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jqm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iqm0(jqm0 jqm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jqm0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jqm0 jqm0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.G(jqm0Var.c, i13.q, (gqm0) obj);
            default:
                ((qtr) obj).b(new k1(jqm0Var, (lnm) null, (byte) 21));
                return rih1.a;
        }
    }
}
