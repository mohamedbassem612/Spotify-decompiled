package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eod implements fod {
    public final Uri a;

    public eod(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eod) && u890.j(this.a, ((eod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
