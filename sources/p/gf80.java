package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gf80 extends jf80 {
    public final DiscardReason a;

    public gf80(DiscardReason discardReason) {
        this.a = discardReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf80) && this.a.equals(((gf80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
