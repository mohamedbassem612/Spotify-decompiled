package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d941 extends f941 {
    public final IOException a;

    public d941(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d941) && this.a.equals(((d941) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
