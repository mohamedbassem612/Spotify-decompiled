package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eft0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ngs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eft0(ngs0 ngs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ngs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ngs0 ngs0Var = this.b;
        switch (b) {
            case 0:
                return ((r0s0) ngs0Var.d).z(((ret0) obj).a, (String) null);
            default:
                ((qtr) obj).b(new gz0(ngs0Var, (lnm) null, (byte) 17));
                return rih1.a;
        }
    }
}
