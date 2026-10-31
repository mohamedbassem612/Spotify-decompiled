package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qgi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kgi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qgi0(kgi0 kgi0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kgi0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kgi0 kgi0Var = this.b;
        switch (b) {
            case 0:
            case 1:
                return kgi0Var;
            case 2:
                kgi0Var.b = false;
                rl7 rl7Var = kgi0Var.c;
                if (rl7Var != null) {
                    mqo1.o(kgi0Var.d, rl7Var);
                }
                kgi0Var.c = null;
                return rih1Var;
            case 3:
            case 4:
            case 5:
                return kgi0Var;
            case 6:
                kgi0Var.b = false;
                rl7 rl7Var2 = kgi0Var.c;
                if (rl7Var2 != null) {
                    mqo1.o(kgi0Var.d, rl7Var2);
                }
                kgi0Var.c = null;
                return rih1Var;
            default:
                return kgi0Var;
        }
    }
}
