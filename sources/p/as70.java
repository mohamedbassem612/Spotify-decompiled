package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class as70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as70(drr0 drr0Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = drr0Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ven0 ven0Var = this.c;
        drr0 drr0Var = this.b;
        switch (b) {
            case 0:
                drr0Var.t(1.0f);
                kaa0.j(0L, ven0Var);
                return rih1.a;
            default:
                return Long.valueOf((long) ((drr0Var.s() * ((pu41) ven0Var.getValue()).b) / 1000.0f));
        }
    }
}
