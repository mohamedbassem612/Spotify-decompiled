package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ptf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptf0(drr0 drr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = drr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        drr0 drr0Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(((float) Math.rint(drr0Var.s() * 20.0f)) / 20.0f);
            default:
                return Float.valueOf(drr0Var.s());
        }
    }
}
