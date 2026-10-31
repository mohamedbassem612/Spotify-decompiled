package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ojk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ojk(int i, hdn0 hdn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = i;
        this.c = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        err0 err0Var = this.c;
        switch (b) {
            case 0:
                err0Var.t(i);
                break;
            default:
                err0Var.t(i);
                break;
        }
        return rih1Var;
    }
}
