package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cgj0 extends hgj0 {
    public final MessageResponseToken a;
    public final DiscardReason$PresentationFailed b;

    public cgj0(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        this.a = messageResponseToken;
        this.b = discardReason$PresentationFailed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgj0)) {
            return false;
        }
        cgj0 cgj0Var = (cgj0) obj;
        return u890.j(this.a, cgj0Var.a) && this.b.equals(cgj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
