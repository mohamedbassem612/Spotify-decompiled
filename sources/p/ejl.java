package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ejl {
    public final Uri a;
    public final boolean b;

    public ejl(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ejl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ejl ejlVar = (ejl) obj;
        return this.a.equals(ejlVar.a) && this.b == ejlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
