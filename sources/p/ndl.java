package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ndl extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndl(cir0 cir0Var, byte b) {
        super(0);
        this.a = b;
        this.b = cir0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cir0 cir0Var = this.b;
        switch (b) {
            case 0:
                cir0Var.c().a(new y231(udl.a));
                break;
            default:
                cir0Var.c().a(l231.a);
                break;
        }
        return rih1Var;
    }
}
