package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xfi0 {
    public final String a;
    public final String b;
    public final String c;
    public final EmbeddedAdMetadata d;

    public xfi0(String str, String str2, String str3, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfi0)) {
            return false;
        }
        xfi0 xfi0Var = (xfi0) obj;
        return this.a.equals(xfi0Var.a) && this.b.equals(xfi0Var.b) && u890.j(this.c, xfi0Var.c) && u890.j(this.d, xfi0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        EmbeddedAdMetadata embeddedAdMetadata = this.d;
        return iHashCode + (embeddedAdMetadata != null ? embeddedAdMetadata.hashCode() : 0);
    }
}
