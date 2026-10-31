package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fij1 {
    public final String a;
    public final Uri b;
    public final long c;

    public fij1(long j, Uri uri, String str) {
        this.a = str;
        this.b = uri;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fij1)) {
            return false;
        }
        fij1 fij1Var = (fij1) obj;
        return this.a.equals(fij1Var.a) && this.b.equals(fij1Var.b) && this.c == fij1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + cy30.f(hrt.h(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}
