package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class he80 extends je80 {
    public final MessageResponseToken a;
    public final String b;
    public final DynamicTagsMetadata c;

    public he80(MessageResponseToken messageResponseToken, String str, DynamicTagsMetadata dynamicTagsMetadata) {
        this.a = messageResponseToken;
        this.b = str;
        this.c = dynamicTagsMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he80)) {
            return false;
        }
        he80 he80Var = (he80) obj;
        return u890.j(this.a, he80Var.a) && u890.j(this.b, he80Var.b) && u890.j(this.c, he80Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        DynamicTagsMetadata dynamicTagsMetadata = this.c;
        return iD + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode());
    }
}
