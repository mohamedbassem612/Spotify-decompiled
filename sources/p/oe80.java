package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oe80 {
    public final m6p1 a;
    public final o6p1 b;
    public final String c;
    public final String d;
    public final DynamicTagsMetadata e;

    public oe80(m6p1 m6p1Var, o6p1 o6p1Var, String str, String str2, DynamicTagsMetadata dynamicTagsMetadata) {
        this.a = m6p1Var;
        this.b = o6p1Var;
        this.c = str;
        this.d = str2;
        this.e = dynamicTagsMetadata;
    }

    public static oe80 a(oe80 oe80Var, m6p1 m6p1Var, o6p1 o6p1Var, String str, String str2, DynamicTagsMetadata dynamicTagsMetadata, int i) {
        if ((i & 1) != 0) {
            m6p1Var = oe80Var.a;
        }
        m6p1 m6p1Var2 = m6p1Var;
        if ((i & 2) != 0) {
            o6p1Var = oe80Var.b;
        }
        o6p1 o6p1Var2 = o6p1Var;
        if ((i & 4) != 0) {
            str = oe80Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = oe80Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            dynamicTagsMetadata = oe80Var.e;
        }
        return new oe80(m6p1Var2, o6p1Var2, str3, str4, dynamicTagsMetadata);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe80)) {
            return false;
        }
        oe80 oe80Var = (oe80) obj;
        return u890.j(this.a, oe80Var.a) && u890.j(this.b, oe80Var.b) && u890.j(this.c, oe80Var.c) && u890.j(this.d, oe80Var.d) && u890.j(this.e, oe80Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.e;
        return iHashCode3 + (dynamicTagsMetadata != null ? dynamicTagsMetadata.hashCode() : 0);
    }
}
