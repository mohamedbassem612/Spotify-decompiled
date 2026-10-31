package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zr2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h461 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr2(h461 h461Var, byte b) {
        super(1);
        this.a = b;
        this.b = h461Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h461 h461Var = this.b;
        switch (b) {
            case 0:
                h461Var.r((String) obj);
                break;
            case 1:
                h461Var.t((String) obj);
                break;
            default:
                h461Var.w((String) obj);
                break;
        }
        return rih1Var;
    }
}
