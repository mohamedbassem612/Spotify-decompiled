package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o7b0 implements Function0 {
    public final /* synthetic */ byte a;
    public final q7b0 b;

    public /* synthetic */ o7b0(q7b0 q7b0Var, byte b) {
        this.a = b;
        this.b = q7b0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        q7b0 q7b0Var = this.b;
        switch (b) {
            case 0:
                return new p7b0(q7b0Var);
            default:
                return u1p1.u(q7b0Var, q7b0Var.s());
        }
    }
}
