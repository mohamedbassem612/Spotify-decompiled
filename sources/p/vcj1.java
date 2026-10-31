package p;

import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vcj1 {
    public final ji0 a;
    public final EmbeddedAdMetadata b;

    public vcj1(ji0 ji0Var, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = ji0Var;
        this.b = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcj1)) {
            return false;
        }
        vcj1 vcj1Var = (vcj1) obj;
        return this.a.equals(vcj1Var.a) && this.b.equals(vcj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
