package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qbi0 {
    public final String a;
    public final String b;
    public final String c;
    public final EmbeddedAdMetadata d;
    public final String e;

    public qbi0(String str, String str2, String str3, EmbeddedAdMetadata embeddedAdMetadata, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = embeddedAdMetadata;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbi0)) {
            return false;
        }
        qbi0 qbi0Var = (qbi0) obj;
        return this.a.equals(qbi0Var.a) && this.b.equals(qbi0Var.b) && this.c.equals(qbi0Var.c) && u890.j(this.d, qbi0Var.d) && u890.j(this.e, qbi0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        EmbeddedAdMetadata embeddedAdMetadata = this.d;
        int iHashCode = (iD + (embeddedAdMetadata == null ? 0 : embeddedAdMetadata.hashCode())) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
