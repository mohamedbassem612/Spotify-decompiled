package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ola1 implements AutoCloseable {
    public final gbc a;

    public final void a(nac nacVar) {
        this.a.Z0(nacVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ola1) {
            return this.a.equals(((ola1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ')';
    }
}
