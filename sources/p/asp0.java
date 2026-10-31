package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class asp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ asp0(z72 z72Var, byte b) {
        super(0);
        this.a = b;
        this.b = z72Var;
    }

    public final Object invoke() {
        byte b = this.a;
        z72 z72Var = this.b;
        switch (b) {
            case 0:
                return (e70) ((kly0) z72Var.i).get();
            default:
                return ((p20) z72Var.t).a((mdp0) z72Var.Z);
        }
    }
}
