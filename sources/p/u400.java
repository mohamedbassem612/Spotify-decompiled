package p;

import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u400 implements k700 {
    public final GetSessionStatusResponse a;

    public u400(GetSessionStatusResponse getSessionStatusResponse) {
        this.a = getSessionStatusResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u400) && this.a.equals(((u400) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
