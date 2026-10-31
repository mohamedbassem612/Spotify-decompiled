package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gsm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d82 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsm(d82 d82Var, byte b) {
        super(1);
        this.a = b;
        this.b = d82Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        d82 d82Var = this.b;
        switch (b) {
            case 0:
                return new hpm((String) obj, (smc0) d82Var.e);
            default:
                return new hpm(d82Var.b, (smc0) d82Var.e);
        }
    }
}
