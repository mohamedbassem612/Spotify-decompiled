package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t6k extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ u5d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6k(iu30 iu30Var, u5d u5dVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = u5dVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u5d u5dVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(((s5d) u5dVar).b);
                break;
            default:
                iu30Var.invoke(((m5d) u5dVar).b);
                break;
        }
        return rih1Var;
    }
}
