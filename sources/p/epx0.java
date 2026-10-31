package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class epx0 {
    public final String a;
    public final String b;
    public final String c;
    public final EmbeddedAdMetadata d;
    public final int e;

    public epx0(String str, String str2, String str3, EmbeddedAdMetadata embeddedAdMetadata, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = embeddedAdMetadata;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epx0)) {
            return false;
        }
        epx0 epx0Var = (epx0) obj;
        return this.a.equals(epx0Var.a) && u890.j(this.b, epx0Var.b) && u890.j(this.c, epx0Var.c) && this.d.equals(epx0Var.d) && this.e == epx0Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
