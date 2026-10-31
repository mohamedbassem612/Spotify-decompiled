package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ie80 extends je80 {
    public final String a;
    public final String b;
    public final DynamicTagsMetadata c;

    public ie80(String str, String str2, DynamicTagsMetadata dynamicTagsMetadata) {
        this.a = str;
        this.b = str2;
        this.c = dynamicTagsMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie80)) {
            return false;
        }
        ie80 ie80Var = (ie80) obj;
        return this.a.equals(ie80Var.a) && u890.j(this.b, ie80Var.b) && this.c.equals(ie80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
