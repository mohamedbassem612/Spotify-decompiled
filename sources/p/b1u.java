package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b1u extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1u(jf01 jf01Var, byte b) {
        super(1);
        this.a = b;
        this.b = jf01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jf01 jf01Var = this.b;
        switch (b) {
            case 0:
                jf01Var.cancel();
                break;
            case 1:
                jf01Var.cancel();
                break;
            default:
                jf01Var.cancel();
                break;
        }
        return rih1Var;
    }
}
