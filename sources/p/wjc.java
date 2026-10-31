package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wjc extends t3k1 {
    public final MessageResponse b;

    public wjc(MessageResponse messageResponse) {
        this.b = messageResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjc) && this.b.equals(((wjc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
