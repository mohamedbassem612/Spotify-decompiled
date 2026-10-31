package p;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class byh extends CompletableFuture {
    public final wyp0 a;

    public byh(wyp0 wyp0Var) {
        this.a = wyp0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
