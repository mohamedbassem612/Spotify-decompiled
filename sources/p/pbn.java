package p;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pbn {
    public final Uri a;
    public final Bitmap b;
    public final String c;

    public pbn(Uri uri, Bitmap bitmap, String str) {
        this.a = uri;
        this.b = bitmap;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbn)) {
            return false;
        }
        pbn pbnVar = (pbn) obj;
        return u890.j(this.a, pbnVar.a) && u890.j(this.c, pbnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ pbn(Uri uri, Bitmap bitmap) {
        this(uri, bitmap, "");
    }
}
