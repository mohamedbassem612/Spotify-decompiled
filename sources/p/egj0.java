package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class egj0 extends hgj0 {
    public final MessageResponseToken a;

    public egj0(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egj0) && u890.j(this.a, ((egj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
