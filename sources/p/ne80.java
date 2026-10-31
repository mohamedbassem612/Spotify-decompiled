package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ne80 {
    public final String a;
    public final String b;
    public final DynamicTagsMetadata c;

    public ne80(String str, String str2, DynamicTagsMetadata dynamicTagsMetadata) {
        this.a = str;
        this.b = str2;
        this.c = dynamicTagsMetadata;
    }

    public final DynamicTagsMetadata a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne80)) {
            return false;
        }
        ne80 ne80Var = (ne80) obj;
        return this.a.equals(ne80Var.a) && u890.j(this.b, ne80Var.b) && this.c.equals(ne80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
