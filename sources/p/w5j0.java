package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w5j0 extends hxo1 {
    public final Message c;

    public w5j0(Message message) {
        this.c = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5j0) && u890.j(this.c, ((w5j0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final Message y() {
        return this.c;
    }
}
