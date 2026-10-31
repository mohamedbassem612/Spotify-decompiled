package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tt71 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi11 b;
    public final /* synthetic */ bma1 c;

    public /* synthetic */ tt71(vi11 vi11Var, bma1 bma1Var, byte b) {
        this.a = b;
        this.b = vi11Var;
        this.c = bma1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        bma1 bma1Var = this.c;
        vi11 vi11Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((dma1) vi11Var.b).h(bma1Var, false));
            default:
                return Boolean.valueOf(((dma1) vi11Var.b).h(bma1Var, true));
        }
    }
}
