package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uvh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tvh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uvh1(tvh1 tvh1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tvh1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tvh1 tvh1Var = this.b;
        switch (b) {
            case 0:
                tvh1Var.f.invoke(Integer.valueOf(((y9e1) obj).b.f));
                return rih1.a;
            default:
                return new kcf1(tvh1Var, (byte) 5);
        }
    }
}
