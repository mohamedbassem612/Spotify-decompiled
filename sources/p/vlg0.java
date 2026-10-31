package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vlg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlg0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                ilg0 ilg0Var = (ilg0) obj;
                d0r d0rVar = (d0r) nm1Var.b;
                return new x010(d3p1.F(d0rVar, (o3r) nm1Var.c, ilg0Var), hn6.a(d0rVar, ilg0Var.a, ilg0Var.b, ilg0Var.e), new wc10(3, null, (byte) 3), (byte) 1);
            default:
                ((qtr) obj).b(new k1(nm1Var, (lnm) null, (byte) 15));
                return rih1.a;
        }
    }
}
