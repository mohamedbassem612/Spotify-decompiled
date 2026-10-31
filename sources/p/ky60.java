package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ky60 implements my60 {
    public final ByteBuffer a;

    public final boolean equals(Object obj) {
        if (obj instanceof ky60) {
            return this.a.equals(((ky60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(buffer=" + this.a + ")";
    }
}
