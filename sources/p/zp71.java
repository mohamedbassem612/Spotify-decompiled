package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zp71 implements dbr0 {
    public final Uri a;

    public zp71(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp71) && this.a.equals(((zp71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
