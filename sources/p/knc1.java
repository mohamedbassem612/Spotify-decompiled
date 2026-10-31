package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class knc1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lnc1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ knc1(lnc1 lnc1Var, byte b) {
        super(1);
        this.a = b;
        this.b = lnc1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnc1 lnc1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(lnc1Var.i == ((g7k1) obj));
            default:
                if (lnc1Var.i == ((g7k1) obj)) {
                    lnc1Var.i = null;
                }
                return rih1.a;
        }
    }
}
