package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ifw0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ofw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ifw0(ofw0 ofw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ofw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ofw0 ofw0Var = this.b;
        switch (b) {
            case 0:
                ofw0Var.k(new qdw0(true));
                break;
            default:
                ofw0Var.k(new qdw0(false));
                break;
        }
        return rih1Var;
    }
}
