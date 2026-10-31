package p;

import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x6g implements q7g {
    public final SubmitCheckoutResponse a;

    public x6g(SubmitCheckoutResponse submitCheckoutResponse) {
        this.a = submitCheckoutResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6g) && this.a.equals(((x6g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
