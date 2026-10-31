package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class amr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ amr(iu30 iu30Var, hsf hsfVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = hsfVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hsf hsfVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new csf(((sba0) hsfVar.a).a));
                break;
            case 1:
                iu30Var.invoke(new esf(((uba0) hsfVar.a).a));
                break;
            case 2:
                iu30Var.invoke(new bsf(((qba0) hsfVar.a).a));
                break;
            default:
                tba0 tba0Var = (tba0) hsfVar.a;
                iu30Var.invoke(new dsf(tba0Var.a, tba0Var.b));
                break;
        }
        return rih1Var;
    }
}
