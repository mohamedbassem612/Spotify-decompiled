package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y4p0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z4p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4p0(z4p0 z4p0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z4p0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        z4p0 z4p0Var = this.b;
        switch (b) {
            case 0:
                return z4p0Var.e;
            default:
                return z4p0Var.a.path();
        }
    }
}
