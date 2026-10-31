package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bem implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ bem(c9 c9Var, byte b) {
        this.a = b;
        this.b = c9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c9 c9Var = this.b;
        switch (b) {
            case 0:
                return ((jhm) c9Var.get(((Number) obj).intValue())).a;
            default:
                c9Var.get(((Number) obj).intValue());
                return null;
        }
    }
}
