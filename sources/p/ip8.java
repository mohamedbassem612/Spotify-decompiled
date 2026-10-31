package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.ShowAuthorMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ip8 implements kp8 {
    public final ShowAuthorMetadata a;

    public ip8(ShowAuthorMetadata showAuthorMetadata) {
        this.a = showAuthorMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip8) && this.a.equals(((ip8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
