package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xd81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zd81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd81(zd81 zd81Var, byte b) {
        super(1);
        this.a = b;
        this.b = zd81Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zd81 zd81Var = this.b;
        switch (b) {
            case 0:
                return zd81Var.b.a();
            case 1:
                ((qtr) obj).b(new eri0(zd81Var, (lnm) null, (byte) 14));
                return rih1.a;
            default:
                return new yir(zd81Var.a.b.a, (byte) 19);
        }
    }
}
