package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oj6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b4g1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj6(b4g1 b4g1Var, byte b) {
        super(0);
        this.a = b;
        this.b = b4g1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        b4g1 b4g1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(b4g1Var.a());
            case 1:
                return Float.valueOf(b4g1Var.g.s());
            default:
                return Float.valueOf(b4g1Var.h.s());
        }
    }
}
