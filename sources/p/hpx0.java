package p;

import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hpx0 {
    public final String a;
    public final String b;
    public final EmbeddedAdMetadata c;

    public hpx0(String str, String str2, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = str2;
        this.c = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpx0)) {
            return false;
        }
        hpx0 hpx0Var = (hpx0) obj;
        return this.a.equals(hpx0Var.a) && this.b.equals(hpx0Var.b) && this.c.equals(hpx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
