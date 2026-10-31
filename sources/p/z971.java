package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z971 {
    public final llw0 a;
    public final int b;
    public final int c;

    public z971(llw0 llw0Var, int i, int i2) {
        this.a = llw0Var;
        this.b = i;
        this.c = i2;
    }

    public final aa71 a() {
        u9 la71Var;
        b3k1 b3k1Var;
        llw0 llw0Var = this.a;
        if (llw0Var instanceof klw0) {
            klw0 klw0Var = (klw0) llw0Var;
            Uri uri = Uri.parse(klw0Var.a);
            long j = klw0Var.b;
            long j2 = klw0Var.c;
            int iC = l1d.C(klw0Var.f);
            if (iC == 0) {
                b3k1Var = b3k1.b;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                b3k1Var = b3k1.c;
            }
            b3k1 b3k1Var2 = b3k1Var;
            la71Var = new na71(uri, j, j2, null, this.b, b3k1Var2, klw0Var.e, klw0Var.d, klw0Var.g);
        } else if (llw0Var instanceof jlw0) {
            jlw0 jlw0Var = (jlw0) llw0Var;
            la71Var = new ma71(Uri.parse(jlw0Var.a), jlw0Var.b);
        } else {
            if (!(llw0Var instanceof ilw0)) {
                eg.o();
                return null;
            }
            ilw0 ilw0Var = (ilw0) llw0Var;
            la71Var = new la71(z4p1.e(ilw0Var.a), z4p1.e(ilw0Var.b), ilw0Var.c);
        }
        return new aa71(la71Var, this.c, x971.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z971)) {
            return false;
        }
        z971 z971Var = (z971) obj;
        return u890.j(this.a, z971Var.a) && this.b == z971Var.b && this.c == z971Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ab80.k(this.c, xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 29791, false), 31);
    }
}
