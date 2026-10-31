package p;

import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y5g implements c6g {
    public final SpotifyCheckoutNative a;

    public y5g(SpotifyCheckoutNative spotifyCheckoutNative) {
        this.a = spotifyCheckoutNative;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5g) && u890.j(this.a, ((y5g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
