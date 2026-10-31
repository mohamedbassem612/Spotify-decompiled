package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fq3 extends hr3 {
    public final MessageResponseToken a;

    static {
        int i = MessageResponseToken.$stable;
    }

    public fq3(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq3) && u890.j(this.a, ((fq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
