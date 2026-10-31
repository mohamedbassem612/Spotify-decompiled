package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n7f1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ k7f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7f1(iu30 iu30Var, k7f1 k7f1Var) {
        super(0);
        this.b = iu30Var;
        this.c = k7f1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k7f1 k7f1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                if (k7f1Var.f != null) {
                    iu30Var.invoke(k7f1Var);
                }
                break;
            default:
                iu30Var.invoke(k7f1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7f1(k7f1 k7f1Var, iu30 iu30Var) {
        super(0);
        this.c = k7f1Var;
        this.b = iu30Var;
    }
}
