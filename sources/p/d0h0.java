package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d0h0 implements k0h0 {
    public final Uri a;
    public final String b;
    public final c380 c;
    public final String d;
    public final long e;

    public d0h0(Uri uri, String str, c380 c380Var, String str2, long j) {
        this.a = uri;
        this.b = str;
        this.c = c380Var;
        this.d = str2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0h0)) {
            return false;
        }
        d0h0 d0h0Var = (d0h0) obj;
        return u890.j(this.a, d0h0Var.a) && this.b.equals(d0h0Var.b) && u890.j(this.c, d0h0Var.c) && u890.j(this.d, d0h0Var.d) && this.e == d0h0Var.e;
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return Long.hashCode(this.e) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
