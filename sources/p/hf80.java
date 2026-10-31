package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hf80 extends jf80 {
    public final DismissReason a;

    public hf80(DismissReason dismissReason) {
        this.a = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf80) && u890.j(this.a, ((hf80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
