package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qak0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qak0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                mak0 mak0Var = (mak0) obj;
                d0r d0rVar = (d0r) nm1Var.b;
                o3r o3rVar = (o3r) nm1Var.c;
                return new x010(d3p1.H(d0rVar, o3rVar, mak0Var.a), d3p1.H(d0rVar, o3rVar, mak0Var.b), new vv70(3, (lnm) null, (byte) 24), (byte) 1);
            default:
                ((qtr) obj).b(new skv(nm1Var, (lnm) null, (byte) 25));
                return rih1.a;
        }
    }
}
