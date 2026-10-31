package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o7t0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ p7t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7t0(iu30 iu30Var, p7t0 p7t0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = p7t0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p7t0 p7t0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new k7t0(p7t0Var.j));
                break;
            default:
                iu30Var.invoke(new l7t0(p7t0Var.l));
                break;
        }
        return rih1Var;
    }
}
