package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pvt0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvt0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H((d0r) nm1Var.b, (o3r) nm1Var.c, (lvt0) obj);
            default:
                ((qtr) obj).b(new u08(nm1Var, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
