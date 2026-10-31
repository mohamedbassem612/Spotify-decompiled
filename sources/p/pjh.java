package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pjh {
    public final GetCommentCardResponse a;
    public final long b;

    public pjh(GetCommentCardResponse getCommentCardResponse, long j) {
        this.a = getCommentCardResponse;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjh)) {
            return false;
        }
        pjh pjhVar = (pjh) obj;
        return this.a.equals(pjhVar.a) && this.b == pjhVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
