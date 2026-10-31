package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gpx0 {
    public final String a;
    public final String b;
    public final String c;
    public final EmbeddedAdMetadata d;

    public gpx0(String str, String str2, String str3, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = embeddedAdMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpx0)) {
            return false;
        }
        gpx0 gpx0Var = (gpx0) obj;
        return this.a.equals(gpx0Var.a) && this.b.equals(gpx0Var.b) && this.c.equals(gpx0Var.c) && this.d.equals(gpx0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
