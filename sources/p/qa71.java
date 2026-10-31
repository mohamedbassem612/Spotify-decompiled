package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qa71 {
    public final Uri a;
    public final h3i0 b;
    public final jdj1 c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;

    public qa71(Uri uri, h3i0 h3i0Var, jdj1 jdj1Var, boolean z, boolean z2, long j, long j2) {
        this.a = uri;
        this.b = h3i0Var;
        this.c = jdj1Var;
        this.d = z;
        this.e = z2;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa71)) {
            return false;
        }
        qa71 qa71Var = (qa71) obj;
        return u890.j(this.a, qa71Var.a) && this.b == qa71Var.b && this.c.equals(qa71Var.c) && this.d == qa71Var.d && this.e == qa71Var.e && this.f == qa71Var.f && this.g == qa71Var.g;
    }

    public final int hashCode() {
        return xcg1.g(cy30.f(cy30.f(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + ab80.k(2, this.a.hashCode() * 31, 31)) * 31)) * 31, 31, this.d), 961, this.e), this.f, 31), this.g, 31), 961, false);
    }
}
