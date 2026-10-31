package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xgj0 extends nyo1 {
    public final MessageResponseToken c;

    static {
        int i = MessageResponseToken.$stable;
    }

    public xgj0(MessageResponseToken messageResponseToken) {
        this.c = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgj0) && u890.j(this.c, ((xgj0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
