package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b7m1 {
    public final String a;
    public final EmbeddedAdMetadata b;

    public b7m1(String str, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7m1)) {
            return false;
        }
        b7m1 b7m1Var = (b7m1) obj;
        return this.a.equals(b7m1Var.a) && this.b.equals(b7m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
