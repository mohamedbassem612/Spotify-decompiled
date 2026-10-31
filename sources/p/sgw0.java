package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sgw0 extends wgw0 {
    public final PlayabilityRestriction a;

    public sgw0(PlayabilityRestriction playabilityRestriction) {
        this.a = playabilityRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgw0) && this.a == ((sgw0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
