package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ak0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ kes c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak0(iu30 iu30Var, kes kesVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = kesVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kes kesVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new sdo(((err0) ((jkr0) kesVar).d.c).s()));
                break;
            default:
                iu30Var.invoke(Integer.valueOf(((err0) ((jkr0) kesVar).d.c).s()));
                break;
        }
        return rih1Var;
    }
}
