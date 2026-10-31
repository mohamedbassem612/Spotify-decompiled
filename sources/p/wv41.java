package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wv41 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bz11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv41(bz11 bz11Var, byte b) {
        super(1);
        this.a = b;
        this.b = bz11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bz11 bz11Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((y751) bz11Var.f).b((hc51) bz11Var.e, ((xb51) obj).a));
            default:
                return Boolean.valueOf(((y751) bz11Var.f).g((hc51) bz11Var.e, ((xb51) obj).a));
        }
    }
}
