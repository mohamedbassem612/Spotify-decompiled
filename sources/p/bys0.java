package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bys0 implements cys0 {
    public final Uri a;

    public bys0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bys0) && this.a.equals(((bys0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
