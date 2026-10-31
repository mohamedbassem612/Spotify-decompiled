package p;

import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m7g implements q7g {
    public final GetSessionStatusResponse a;

    public m7g(GetSessionStatusResponse getSessionStatusResponse) {
        this.a = getSessionStatusResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7g) && this.a.equals(((m7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
