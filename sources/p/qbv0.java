package p;

import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qbv0 implements sbv0 {
    public final ClientPollResponse a;

    public qbv0(ClientPollResponse clientPollResponse) {
        this.a = clientPollResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbv0) && this.a.equals(((qbv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
