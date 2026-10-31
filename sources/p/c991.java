package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c991 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ngs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c991(ngs0 ngs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ngs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ngs0 ngs0Var = this.b;
        switch (b) {
            case 0:
                return new b991(((h991) ngs0Var.d).c.D());
            default:
                ((qtr) obj).b(new pnp0(ngs0Var, null, (byte) 25));
                return rih1.a;
        }
    }
}
