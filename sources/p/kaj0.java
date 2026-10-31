package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kaj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ maj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kaj0(iu30 iu30Var, maj0 maj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = maj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        maj0 maj0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(maj0Var.a == 2 ? iaj0.d : iaj0.b);
                break;
            default:
                iu30Var.invoke(maj0Var.a == 2 ? iaj0.e : iaj0.c);
                break;
        }
        return rih1Var;
    }
}
