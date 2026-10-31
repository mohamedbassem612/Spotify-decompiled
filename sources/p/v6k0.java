package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v6k0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p6k0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6k0(p6k0 p6k0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = p6k0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n6k0 n6k0Var = n6k0.a;
        n6k0 n6k0Var2 = n6k0.c;
        p6k0 p6k0Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                o6k0 o6k0Var = p6k0Var.a;
                if (!o6k0Var.c) {
                    if (o6k0Var.a) {
                        iu30Var.invoke(n6k0Var);
                    }
                } else if (p6k0Var.b) {
                    iu30Var.invoke(n6k0Var2);
                }
                break;
            default:
                o6k0 o6k0Var2 = p6k0Var.a;
                if (!o6k0Var2.c) {
                    if (o6k0Var2.a) {
                        iu30Var.invoke(n6k0Var);
                    }
                } else if (p6k0Var.b) {
                    iu30Var.invoke(n6k0Var2);
                }
                break;
        }
        return rih1Var;
    }
}
