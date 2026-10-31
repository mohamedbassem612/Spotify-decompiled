package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lem0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uem0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lem0(uem0 uem0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uem0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uem0 uem0Var = this.b;
        switch (b) {
            case 0:
                return uem0Var.j;
            default:
                return uem0Var.k;
        }
    }
}
