package p;

import com.spotify.challenges.v1.api.pub.proto.GetSessionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mn81 extends nn81 {
    public final GetSessionResponse a;

    public mn81(GetSessionResponse getSessionResponse) {
        this.a = getSessionResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn81) && this.a.equals(((mn81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
