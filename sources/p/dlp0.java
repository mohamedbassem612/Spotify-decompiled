package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dlp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ elp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dlp0(elp0 elp0Var, byte b) {
        super(0);
        this.a = b;
        this.b = elp0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        elp0 elp0Var = this.b;
        switch (b) {
            case 0:
                elp0Var.e.k(xkp0.c);
                break;
            default:
                elp0Var.e.k(zkp0.c);
                break;
        }
        return rih1Var;
    }
}
