package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i0f1 {
    public static final bma1 b;
    public static final bma1 c;
    public static final bma1 d;
    public final dma1 a;

    static {
        nbc nbcVar = bma1.b;
        b = nbcVar.k("device_sync_token");
        c = nbcVar.k("device_sync_token_first_seen_at");
        d = nbcVar.k("device_sync_token_last_fetched_at");
    }

    public i0f1(dma1 dma1Var) {
        this.a = dma1Var;
    }
}
