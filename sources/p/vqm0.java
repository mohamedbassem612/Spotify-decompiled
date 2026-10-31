package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vqm0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqm0(yqm0 yqm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yqm0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yqm0 yqm0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.G(yqm0Var.c, i13.r, (tqm0) obj);
            default:
                ((qtr) obj).b(new jaz(yqm0Var, (lnm) null, (byte) 16));
                return rih1.a;
        }
    }
}
