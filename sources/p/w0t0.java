package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w0t0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0t0(y0t0 y0t0Var, byte b) {
        super(0);
        this.a = b;
        this.b = y0t0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y0t0 y0t0Var = this.b;
        switch (b) {
            case 0:
                y0t0Var.b2 = true;
                y0t0Var.Z0(false, false);
                break;
            default:
                y0t0Var.b2 = false;
                y0t0Var.Z0(false, false);
                break;
        }
        return rih1Var;
    }
}
