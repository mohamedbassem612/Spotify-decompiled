package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jak0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jak0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                cak0 cak0Var = (cak0) obj;
                d0r d0rVar = (d0r) nm1Var.b;
                return new x010(new s1g(new fu20(d3p1.F(d0rVar, (o3r) nm1Var.c, cak0Var), new fca0(2, (lnm) null, (byte) 17), (byte) 1), (byte) 8), new k6e0(new s1g(new fu20(d3p1.F(d0rVar, (o3r) nm1Var.g, cak0Var), new fca0(2, (lnm) null, (byte) 18), (byte) 1), (byte) 7), (byte) 5), new vv70(3, (lnm) null, (byte) 23), (byte) 1);
            default:
                ((qtr) obj).b(new skv(nm1Var, (lnm) null, (byte) 24));
                return rih1.a;
        }
    }
}
