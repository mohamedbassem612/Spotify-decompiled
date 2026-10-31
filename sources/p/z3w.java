package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z3w extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ltf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3w(ltf1 ltf1Var, byte b) {
        super(0);
        this.a = b;
        this.b = ltf1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ltf1 ltf1Var = this.b;
        switch (b) {
            case 0:
                ltf1Var.k();
                break;
            default:
                ltf1Var.j();
                break;
        }
        return rih1Var;
    }
}
