package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g5f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ w4i1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5f(iu30 iu30Var, w4i1 w4i1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = w4i1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w4i1 w4i1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(w4i1Var);
                break;
            default:
                iu30Var.invoke(new c3f(w4i1Var.a));
                break;
        }
        return rih1Var;
    }
}
