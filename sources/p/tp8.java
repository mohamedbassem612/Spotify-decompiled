package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tp8 {
    public final Uri a;
    public final String b;

    public tp8(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp8)) {
            return false;
        }
        tp8 tp8Var = (tp8) obj;
        return this.a.equals(tp8Var.a) && u890.j(this.b, tp8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
