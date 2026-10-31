package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class meg0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final Uri e;
    public final int f;
    public final long g;

    public meg0(int i, String str, String str2, int i2, Uri uri, int i3, long j) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = uri;
        this.f = i3;
        this.g = j;
    }

    public final String a() {
        lik1 lik1VarB;
        int iC = l1d.C(this.d);
        String str = this.b;
        if (iC == 0 || iC == 1 || iC == 2) {
            lik1VarB = nik1.T3.b("spotify:internal:managed-account-details:child:".concat(str));
        } else if (iC != 3) {
            if (iC != 4) {
                eg.o();
                return null;
            }
            lik1VarB = nik1.T3.b("spotify:internal:managed-account-details:child:".concat(str));
        } else {
            lik1VarB = nik1.U3.b("spotify:internal:managed-account-details:teen:".concat(str));
        }
        return lik1VarB.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meg0)) {
            return false;
        }
        meg0 meg0Var = (meg0) obj;
        if (this.a != meg0Var.a || !this.b.equals(meg0Var.b) || !this.c.equals(meg0Var.c) || this.d != meg0Var.d || !this.e.equals(meg0Var.e) || this.f != meg0Var.f) {
            return false;
        }
        long j = meg0Var.g;
        int i = u7h.l;
        return z4h1.b(this.g, j);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.f, hrt.h(this.e, ab80.k(this.d, cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31);
        int i = u7h.l;
        return Long.hashCode(this.g) + iF;
    }
}
