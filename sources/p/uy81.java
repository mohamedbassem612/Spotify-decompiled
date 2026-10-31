package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uy81 {
    public final yqg a;
    public final kly0 b;
    public volatile Long c;
    public final az81 d;

    public uy81(s4c0 s4c0Var, yqg yqgVar, kly0 kly0Var, q8n q8nVar) {
        this.a = yqgVar;
        this.b = kly0Var;
        this.d = new az81(new elg(999, "Uninitialised"), s4c0Var, new d061(1, this, uy81.class, "shouldRefresh", "shouldRefresh(Lcom/spotify/connectivity/httpclienttoken/ClientToken;)Z", 0, (byte) 10), gr81.d, new d781(this, (byte) 16), q8nVar);
    }

    public final dlg a() {
        Object elgVar;
        az81 az81Var = this.d;
        az81Var.getClass();
        try {
            elgVar = jo31.t(o6x.a, new wy81(az81Var, null, (byte) 1));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            elgVar = new elg(NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS, "Client token request interrupted");
        }
        return (dlg) elgVar;
    }

    public final void b() {
        az81 az81Var = this.d;
        if (az81Var.h == az81Var.g.getAndIncrement()) {
            az81Var.a.cancel();
        }
    }
}
