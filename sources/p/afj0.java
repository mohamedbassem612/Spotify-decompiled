package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class afj0 extends bfj0 {
    public final MessageResponseToken a;

    public afj0(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afj0) && u890.j(this.a, ((afj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
