package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jf60 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ smc0 b;

    public /* synthetic */ jf60(smc0 smc0Var, byte b) {
        this.a = b;
        this.b = smc0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        smc0 smc0Var = this.b;
        switch (b) {
            case 0:
                return z860.b1.invoke(smc0Var.get(((Number) obj).intValue()));
            default:
                smc0Var.get(((Number) obj).intValue());
                return null;
        }
    }
}
