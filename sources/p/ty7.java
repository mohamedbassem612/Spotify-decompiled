package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ty7 extends tto1 {
    public final Uri b;
    public final boolean c;

    public ty7(Uri uri, boolean z) {
        this.b = uri;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty7)) {
            return false;
        }
        ty7 ty7Var = (ty7) obj;
        return u890.j(this.b, ty7Var.b) && this.c == ty7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
