package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uy61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jd6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy61(jd6 jd6Var, byte b) {
        super(1);
        this.a = b;
        this.b = jd6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jd6 jd6Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H((d0r) jd6Var.b, jd6Var.c, (py61) obj);
            default:
                ((qtr) obj).b(new k8y0(jd6Var, (lnm) null, (byte) 14));
                return rih1.a;
        }
    }
}
