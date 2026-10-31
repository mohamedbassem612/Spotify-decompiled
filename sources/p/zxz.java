package p;

import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zxz implements k700 {
    public final GetSpotifyCheckoutPageResponse a;

    public zxz(GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse) {
        this.a = getSpotifyCheckoutPageResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxz) && this.a.equals(((zxz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
