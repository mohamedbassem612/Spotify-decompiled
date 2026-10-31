package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5n0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ u5n0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5n0(u5n0 u5n0Var, iu30 iu30Var) {
        super(0);
        this.b = u5n0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        u5n0 u5n0Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new m5n0(u5n0Var.a));
                break;
            default:
                int i = u5n0Var.h;
                String str = u5n0Var.a;
                iu30Var.invoke(i == 2 ? new n5n0(str) : new m5n0(str));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5n0(iu30 iu30Var, u5n0 u5n0Var) {
        super(0);
        this.c = iu30Var;
        this.b = u5n0Var;
    }
}
