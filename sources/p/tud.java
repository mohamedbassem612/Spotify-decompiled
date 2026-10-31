package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tud extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gk31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tud(gk31 gk31Var, byte b) {
        super(0);
        this.a = b;
        this.b = gk31Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gk31 gk31Var = this.b;
        switch (b) {
            case 0:
                gk31Var.b.invoke();
                break;
            default:
                gk31Var.c.invoke();
                break;
        }
        return rih1Var;
    }
}
