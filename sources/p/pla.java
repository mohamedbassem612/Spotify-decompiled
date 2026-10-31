package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pla extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oo6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pla(oo6 oo6Var, byte b) {
        super(0);
        this.a = b;
        this.b = oo6Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oo6 oo6Var = this.b;
        switch (b) {
            case 0:
                oo6Var.invoke(chz0.a);
                break;
            case 1:
                oo6Var.invoke(chz0.b);
                break;
            default:
                oo6Var.invoke(chz0.c);
                break;
        }
        return rih1Var;
    }
}
