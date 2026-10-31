package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oba0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oba0(z72 z72Var, byte b) {
        super(0);
        this.a = b;
        this.b = z72Var;
    }

    public final Object invoke() {
        byte b = this.a;
        z72 z72Var = this.b;
        switch (b) {
            case 0:
                return n3o1.q(z72Var).a(mx90.R0, mx90.S0);
            default:
                return n3o1.q(z72Var).a(mx90.T0, mx90.U0);
        }
    }
}
