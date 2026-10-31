package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class st71 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi11 b;

    public /* synthetic */ st71(vi11 vi11Var, byte b) {
        this.a = b;
        this.b = vi11Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        vi11 vi11Var = this.b;
        switch (b) {
            case 0:
                return Long.valueOf(((dma1) vi11Var.b).g((bma1) vi11Var.f, 0L));
            default:
                return Boolean.valueOf(((dma1) vi11Var.b).h((bma1) vi11Var.e, false));
        }
    }
}
