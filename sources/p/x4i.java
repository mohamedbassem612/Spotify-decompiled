package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x4i extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ h02 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4i(iu30 iu30Var, h02 h02Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = h02Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h02 h02Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new a02(h02Var.g, (p60) obj));
                break;
            default:
                iu30Var.invoke(new b02(h02Var.g, (String) obj));
                break;
        }
        return rih1Var;
    }
}
