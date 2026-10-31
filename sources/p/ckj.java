package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ckj extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r1q0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckj(r1q0 r1q0Var, byte b) {
        super(0);
        this.a = b;
        this.b = r1q0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r1q0 r1q0Var = this.b;
        switch (b) {
            case 0:
                if (r1q0Var != null) {
                    r1q0Var.d();
                }
                break;
            case 1:
                r1q0Var.c();
                break;
            default:
                r1q0Var.d();
                break;
        }
        return rih1Var;
    }
}
