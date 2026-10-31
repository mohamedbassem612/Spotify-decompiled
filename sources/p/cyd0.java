package p;

import com.spotify.liveroom.livestreampagefragment.v1.proto.LiveStreamStateMessage;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyd0 implements azd0 {
    public final LiveStreamStateMessage a;

    public cyd0(LiveStreamStateMessage liveStreamStateMessage) {
        this.a = liveStreamStateMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyd0) && this.a.equals(((cyd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
