package p;

import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wwz implements k700 {
    public final SubmitCheckoutResponse a;

    public wwz(SubmitCheckoutResponse submitCheckoutResponse) {
        this.a = submitCheckoutResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwz) && this.a.equals(((wwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
