package p;

import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.browsita.v2.resolved.showcase.CreativeAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kc81 {
    public final String a;
    public final EmbeddedAdMetadata b;
    public final sd81 c;
    public final CreativeAdMetadata d;

    public kc81(String str, EmbeddedAdMetadata embeddedAdMetadata, sd81 sd81Var, CreativeAdMetadata creativeAdMetadata) {
        this.a = str;
        this.b = embeddedAdMetadata;
        this.c = sd81Var;
        this.d = creativeAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc81)) {
            return false;
        }
        kc81 kc81Var = (kc81) obj;
        return this.a.equals(kc81Var.a) && this.b.equals(kc81Var.b) && this.c.equals(kc81Var.c) && u890.j(this.d, kc81Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        CreativeAdMetadata creativeAdMetadata = this.d;
        return iHashCode + (creativeAdMetadata == null ? 0 : creativeAdMetadata.hashCode());
    }
}
