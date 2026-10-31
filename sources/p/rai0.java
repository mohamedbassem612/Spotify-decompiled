package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rai0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aru0 b;
    public final /* synthetic */ ubw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rai0(aru0 aru0Var, ubw0 ubw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = aru0Var;
        this.c = ubw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ubw0 ubw0Var = this.c;
        aru0 aru0Var = this.b;
        switch (b) {
            case 0:
                return aru0Var.d(ubw0Var, ubw0Var, true, ubw0Var);
            case 1:
                return aru0Var.d(ubw0Var, ubw0Var, true, ubw0Var);
            default:
                return aru0Var.d(ubw0Var, ubw0Var, false, ubw0Var);
        }
    }
}
