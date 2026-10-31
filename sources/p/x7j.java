package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x7j extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ kct0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7j(iu30 iu30Var, kct0 kct0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = kct0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kct0 kct0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new wym1(kct0Var.g, kct0Var.f));
                break;
            default:
                iu30Var.invoke(kct0Var.f);
                break;
        }
        return rih1Var;
    }
}
