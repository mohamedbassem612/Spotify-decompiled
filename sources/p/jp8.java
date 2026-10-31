package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.UserAuthorMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jp8 implements kp8 {
    public final UserAuthorMetadata a;

    public jp8(UserAuthorMetadata userAuthorMetadata) {
        this.a = userAuthorMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp8) && this.a.equals(((jp8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
