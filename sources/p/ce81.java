package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.showcase.v2.CreativeAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ce81 {
    public final String a;
    public final EmbeddedAdMetadata b;
    public final ae81 c;
    public final CreativeAdMetadata d;

    public ce81(String str, EmbeddedAdMetadata embeddedAdMetadata, ae81 ae81Var, CreativeAdMetadata creativeAdMetadata) {
        this.a = str;
        this.b = embeddedAdMetadata;
        this.c = ae81Var;
        this.d = creativeAdMetadata;
    }

    public final CreativeAdMetadata a() {
        return this.d;
    }

    public final EmbeddedAdMetadata b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final ae81 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce81)) {
            return false;
        }
        ce81 ce81Var = (ce81) obj;
        return this.a.equals(ce81Var.a) && this.b.equals(ce81Var.b) && this.c.equals(ce81Var.c) && u890.j(this.d, ce81Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        CreativeAdMetadata creativeAdMetadata = this.d;
        return iHashCode + (creativeAdMetadata == null ? 0 : creativeAdMetadata.hashCode());
    }
}
