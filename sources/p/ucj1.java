package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ucj1 {
    public final String a;
    public final ji0 b;
    public final EmbeddedAdMetadata c;

    public ucj1(String str, ji0 ji0Var, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = ji0Var;
        this.c = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucj1)) {
            return false;
        }
        ucj1 ucj1Var = (ucj1) obj;
        return u890.j(this.a, ucj1Var.a) && this.b.equals(ucj1Var.b) && this.c.equals(ucj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
