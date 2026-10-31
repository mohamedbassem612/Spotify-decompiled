package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ruf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruf1(nl9 nl9Var, byte b) {
        super(1);
        this.a = b;
        this.b = nl9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        nl9 nl9Var = this.b;
        switch (b) {
            case 0:
                String str = ((luf1) obj).a;
                rcy rcyVar = (rcy) nl9Var.b;
                return new x010(hu20.e(new lt20(new mpy0(yoi1.g(rcyVar.a.b(new oi("reinvent-free-track-preview-upsell", false, new ysf1(str, (byte) 1))).filter(rdx0.S0)), rcyVar, str, (byte) 24), new q8t0(3, (lnm) null, (byte) 20), (byte) 0), new c6e0((byte) 26, nl9Var, str, (lnm) null)), new lt20(new jha1(((yo31) nl9Var.e).c(), (byte) 20), new q8t0(3, (lnm) null, (byte) 21), (byte) 0), new bu51(3, (lnm) null, (byte) 14), (byte) 1);
            default:
                ((qtr) obj).b(new f3((avl1) nl9Var, lnmVar, (byte) 28));
                return rih1.a;
        }
    }
}
