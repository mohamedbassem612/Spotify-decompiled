package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i0c {
    public final MessageResponseToken a;
    public final BottomSheetTemplate b;
    public final boolean c;

    static {
        BottomSheetTemplate.Companion companion = BottomSheetTemplate.Companion;
        int i = MessageResponseToken.$stable;
    }

    public i0c(MessageResponseToken messageResponseToken, BottomSheetTemplate bottomSheetTemplate, boolean z) {
        this.a = messageResponseToken;
        this.b = bottomSheetTemplate;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0c)) {
            return false;
        }
        i0c i0cVar = (i0c) obj;
        return this.a.equals(i0cVar.a) && this.b.equals(i0cVar.b) && this.c == i0cVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
