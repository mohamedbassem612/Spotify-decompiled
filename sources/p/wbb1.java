package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wbb1 {
    public final Uri a;
    public final Uri b;

    public wbb1(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbb1)) {
            return false;
        }
        wbb1 wbb1Var = (wbb1) obj;
        return this.a.equals(wbb1Var.a) && this.b.equals(wbb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
