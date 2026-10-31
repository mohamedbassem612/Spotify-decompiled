package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5j1 {
    public final String a;
    public final String b;
    public final String c;
    public final EmbeddedAdMetadata d;

    public z5j1(String str, String str2, String str3, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5j1)) {
            return false;
        }
        z5j1 z5j1Var = (z5j1) obj;
        return this.a.equals(z5j1Var.a) && this.b.equals(z5j1Var.b) && u890.j(this.c, z5j1Var.c) && this.d.equals(z5j1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
