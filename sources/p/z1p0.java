package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z1p0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a2p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1p0(a2p0 a2p0Var, byte b) {
        super(1);
        this.a = b;
        this.b = a2p0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        a2p0 a2p0Var = this.b;
        switch (b) {
            case 0:
                return new x010(d5p1.h(a2p0Var.a.e), yoi1.g(a2p0Var.b), new lok0(3, (lnm) null, (byte) 6), (byte) 1);
            default:
                ((qtr) obj).b(new jaz(a2p0Var, (lnm) null, (byte) 19));
                return rih1.a;
        }
    }
}
