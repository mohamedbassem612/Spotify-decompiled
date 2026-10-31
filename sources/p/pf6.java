package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pf6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf6(xd6 xd6Var, byte b) {
        super(0);
        this.a = b;
        this.b = xd6Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xd6 xd6Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(xd6Var != null ? xd6Var.c.s() : 0.0f);
            default:
                return Float.valueOf(xd6Var != null ? xd6Var.d.s() : 0.0f);
        }
    }
}
