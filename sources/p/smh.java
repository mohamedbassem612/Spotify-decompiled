package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class smh extends k8p1 {
    public final GetCommentCardResponse c;

    public smh(GetCommentCardResponse getCommentCardResponse) {
        this.c = getCommentCardResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smh) && this.c.equals(((smh) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
