package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qee0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ihg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qee0(ihg0 ihg0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ihg0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ihg0 ihg0Var = this.b;
        switch (b) {
            case 0:
                ihg0Var.a((String) obj);
                break;
            default:
                ihg0Var.a((String[]) obj);
                break;
        }
        return rih1Var;
    }
}
