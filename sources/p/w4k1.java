package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w4k1 implements b5k1 {
    public final u771 a;
    public final Uri b;
    public final long c;
    public final boolean d;
    public final String e;

    public w4k1(u771 u771Var, Uri uri, long j, boolean z, String str) {
        this.a = u771Var;
        this.b = uri;
        this.c = j;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4k1)) {
            return false;
        }
        w4k1 w4k1Var = (w4k1) obj;
        return u890.j(this.a, w4k1Var.a) && u890.j(this.b, w4k1Var.b) && vve1.a(this.c, w4k1Var.c) && this.d == w4k1Var.d && u890.j(this.e, w4k1Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.f(hrt.h(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
