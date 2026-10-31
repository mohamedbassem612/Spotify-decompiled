package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gsg implements AutoCloseable, c9n {
    public final o8n a;

    public gsg(o8n o8nVar) {
        this.a = o8nVar;
    }

    public final o8n J() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        op71.m(this.a, (CancellationException) null);
    }
}
