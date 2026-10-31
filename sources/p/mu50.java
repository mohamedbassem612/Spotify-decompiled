package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mu50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ku50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu50(ku50 ku50Var, byte b) {
        super(1);
        this.a = b;
        this.b = ku50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ku50 ku50Var = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).a(ku50Var.d);
            case 1:
                return ((o3m0) obj).a(ku50Var.d);
            default:
                b261.n((e261) obj, ku50Var.b);
                return rih1.a;
        }
    }
}
