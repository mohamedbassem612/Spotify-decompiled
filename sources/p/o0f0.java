package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o0f0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w6e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0f0(w6e0 w6e0Var, byte b) {
        super(0);
        this.a = b;
        this.b = w6e0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        w6e0 w6e0Var = this.b;
        switch (b) {
            case 0:
                return (i8h1) ((kly0) w6e0Var.d).get();
            default:
                return new l7l0(2, ((ksk0) w6e0Var.b).b());
        }
    }
}
