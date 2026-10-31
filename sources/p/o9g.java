package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o9g {
    public final String a;
    public final String b;
    public final Uri c;

    public o9g(Uri uri, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9g)) {
            return false;
        }
        o9g o9gVar = (o9g) obj;
        return this.a.equals(o9gVar.a) && this.b.equals(o9gVar.b) && this.c.equals(o9gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
