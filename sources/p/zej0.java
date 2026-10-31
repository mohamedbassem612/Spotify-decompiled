package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zej0 extends bfj0 {
    public final MessageResponseToken a;

    public zej0(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zej0) && u890.j(this.a, ((zej0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
