package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class be80 extends m6p1 {
    public final MessageResponseToken c;

    public be80(MessageResponseToken messageResponseToken) {
        this.c = messageResponseToken;
    }

    public final MessageResponseToken A() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be80) && u890.j(this.c, ((be80) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
