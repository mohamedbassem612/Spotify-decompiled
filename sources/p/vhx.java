package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vhx extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ frr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vhx(yqg yqgVar, frr0 frr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = yqgVar;
        this.c = frr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yqg yqgVar = this.b;
        frr0 frr0Var = this.c;
        switch (b) {
            case 0:
                frr0Var.t(yqgVar.b());
                break;
            default:
                frr0Var.t(yqgVar.b());
                break;
        }
        return rih1Var;
    }
}
