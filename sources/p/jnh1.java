package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jnh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jnh1(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(el9Var.b, el9Var.c, (lnh1) obj);
            default:
                ((qtr) obj).b(new k8y0(el9Var, (lnm) null, (byte) 26));
                return rih1.a;
        }
    }
}
