package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iqc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gqc0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqc0(gqc0 gqc0Var, iu30 iu30Var) {
        super(0);
        this.b = gqc0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        tpc0 tpc0Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new ipc0(((dqc0) tpc0Var).a.a));
                break;
            default:
                iu30Var.invoke(new ipc0(tpc0Var.b.a));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqc0(iu30 iu30Var, gqc0 gqc0Var) {
        super(0);
        this.c = iu30Var;
        this.b = gqc0Var;
    }
}
