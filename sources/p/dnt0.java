package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dnt0 {
    public final String a;
    public final EmbeddedAdMetadata b;

    public dnt0(String str, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnt0)) {
            return false;
        }
        dnt0 dnt0Var = (dnt0) obj;
        return this.a.equals(dnt0Var.a) && u890.j(this.b, dnt0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EmbeddedAdMetadata embeddedAdMetadata = this.b;
        return iHashCode + (embeddedAdMetadata == null ? 0 : embeddedAdMetadata.hashCode());
    }
}
