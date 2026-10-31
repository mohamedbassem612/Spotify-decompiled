package p;

import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpx0 {
    public final String a;
    public final String b;
    public final EmbeddedAdMetadata c;
    public final int d;

    public fpx0(String str, String str2, EmbeddedAdMetadata embeddedAdMetadata, int i) {
        this.a = str;
        this.b = str2;
        this.c = embeddedAdMetadata;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpx0)) {
            return false;
        }
        fpx0 fpx0Var = (fpx0) obj;
        return this.a.equals(fpx0Var.a) && this.b.equals(fpx0Var.b) && this.c.equals(fpx0Var.c) && this.d == fpx0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
