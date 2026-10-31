package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mzf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ozf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzf0(ozf0 ozf0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ozf0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ozf0 ozf0Var = this.b;
        switch (b) {
            case 0:
                ozf0Var.c.a(c7p0.b);
                break;
            default:
                ozf0Var.c.a(c7p0.a);
                break;
        }
        return rih1Var;
    }
}
