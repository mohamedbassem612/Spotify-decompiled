package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ es41 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g61(es41 es41Var, byte b) {
        super(0);
        this.a = b;
        this.b = es41Var;
    }

    public final Object invoke() {
        byte b = this.a;
        es41 es41Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(es41Var.h.b());
            case 1:
                return Boolean.valueOf(es41Var.f.s() > 0);
            case 2:
                return Integer.valueOf(es41Var.f.s());
            case 3:
                return Boolean.valueOf(es41Var.a.s() > 0);
            default:
                return Integer.valueOf(es41Var.f.s());
        }
    }
}
