package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hmg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmg0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                fmg0 fmg0Var = (fmg0) obj;
                d0r d0rVar = (d0r) nm1Var.b;
                return new x010(d3p1.H(d0rVar, (o3r) nm1Var.c, fmg0Var), hn6.a(d0rVar, fmg0Var.b, fmg0Var.e, fmg0Var.h), new vv70(3, (lnm) null, (byte) 18), (byte) 1);
            default:
                ((qtr) obj).b(new jaz(nm1Var, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
