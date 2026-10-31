package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rzb extends exd0 {
    public final MessageResponseToken c;

    static {
        int i = MessageResponseToken.$stable;
    }

    public rzb(MessageResponseToken messageResponseToken) {
        this.c = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzb) && this.c.equals(((rzb) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
