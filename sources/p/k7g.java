package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k7g implements q7g {
    public final String a;
    public final GetCheckoutPageResponse b;

    public k7g(String str, GetCheckoutPageResponse getCheckoutPageResponse) {
        this.a = str;
        this.b = getCheckoutPageResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7g)) {
            return false;
        }
        k7g k7gVar = (k7g) obj;
        return u890.j(this.a, k7gVar.a) && this.b.equals(k7gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
