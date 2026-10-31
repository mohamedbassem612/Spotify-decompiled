package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bma0 implements Function0 {
    public final /* synthetic */ byte a;
    public final ema0 b;

    public /* synthetic */ bma0(ema0 ema0Var, byte b) {
        this.a = b;
        this.b = ema0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ema0 ema0Var = this.b;
        switch (b) {
            case 0:
                return new dma0(ema0Var);
            default:
                return v1p1.f(ema0Var.b);
        }
    }
}
