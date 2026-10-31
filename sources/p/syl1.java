package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class syl1 implements y561 {
    public final Uri a;
    public final String b;
    public final boolean c;
    public final long d;

    public syl1(Uri uri, String str, boolean z, long j) {
        this.a = uri;
        this.b = str;
        this.c = z;
        this.d = j;
    }

    public final long a() {
        return this.d;
    }

    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syl1)) {
            return false;
        }
        syl1 syl1Var = (syl1) obj;
        return this.a.equals(syl1Var.a) && u890.j(this.b, syl1Var.b) && this.c == syl1Var.c && this.d == syl1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
