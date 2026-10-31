package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l321 extends m6p1 {
    public final Message c;

    public l321(Message message) {
        this.c = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l321) && u890.j(this.c, ((l321) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
