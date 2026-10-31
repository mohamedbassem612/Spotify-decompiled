package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pfh implements sfh {
    public final GetCommentCardResponse a;

    public pfh(GetCommentCardResponse getCommentCardResponse) {
        this.a = getCommentCardResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfh) && this.a.equals(((pfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
