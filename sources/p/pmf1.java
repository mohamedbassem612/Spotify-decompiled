package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pmf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qmf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmf1(qmf1 qmf1Var, byte b) {
        super(1);
        this.a = b;
        this.b = qmf1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qmf1 qmf1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(qmf1Var.c, qmf1Var.f, (nmf1) obj);
            default:
                ((qtr) obj).b(new k8y0(qmf1Var, (lnm) null, (byte) 22));
                return rih1.a;
        }
    }
}
