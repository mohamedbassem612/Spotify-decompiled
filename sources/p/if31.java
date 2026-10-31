package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class if31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if31(jf31 jf31Var, byte b) {
        super(1);
        this.a = b;
        this.b = jf31Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jf31 jf31Var = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new k8y0(jf31Var, (lnm) null, (byte) 8));
                return rih1.a;
            default:
                return new xwm0(jf31Var, (byte) 21);
        }
    }
}
