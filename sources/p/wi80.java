package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wi80 {
    public final boolean a;
    public final Uri b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public wi80(boolean z, Uri uri, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = uri;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi80)) {
            return false;
        }
        wi80 wi80Var = (wi80) obj;
        return this.a == wi80Var.a && u890.j(this.b, wi80Var.b) && this.c == wi80Var.c && this.d == wi80Var.d && this.e == wi80Var.e && this.f == wi80Var.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
