package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wu11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu11(xu11 xu11Var, byte b) {
        super(0);
        this.a = b;
        this.b = xu11Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xu11 xu11Var = this.b;
        switch (b) {
            case 0:
                xu11Var.c.invoke(ee00.a);
                break;
            default:
                xu11Var.c.invoke(de00.a);
                break;
        }
        return rih1Var;
    }
}
