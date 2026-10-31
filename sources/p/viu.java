package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class viu {
    public final String a;
    public final ji0 b;
    public final EmbeddedAdMetadata c;

    public viu(String str, ji0 ji0Var, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = ji0Var;
        this.c = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viu)) {
            return false;
        }
        viu viuVar = (viu) obj;
        return u890.j(this.a, viuVar.a) && this.b.equals(viuVar.b) && this.c.equals(viuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
