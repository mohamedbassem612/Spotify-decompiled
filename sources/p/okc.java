package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.AdPlayingState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class okc extends jlc {
    public final AdPlayingState a;

    public okc(AdPlayingState adPlayingState) {
        this.a = adPlayingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okc) && this.a == ((okc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
