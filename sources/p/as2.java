package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class as2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k461 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as2(k461 k461Var, byte b) {
        super(1);
        this.a = b;
        this.b = k461Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k461 k461Var = this.b;
        switch (b) {
            case 0:
                k461Var.s((String) obj);
                break;
            case 1:
                k461Var.u((String) obj);
                break;
            default:
                k461Var.w((String) obj);
                break;
        }
        return rih1Var;
    }
}
