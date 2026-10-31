package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z5j0 extends vxo1 {
    public final Message.CreativeMessage c;

    public z5j0(Message.CreativeMessage creativeMessage) {
        this.c = creativeMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5j0) && this.c.equals(((z5j0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final Message.CreativeMessage p() {
        return this.c;
    }
}
