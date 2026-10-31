package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q1b1 {
    public final boolean a;
    public final boolean b;
    public final Long c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;

    public q1b1(boolean z, boolean z2, Long l, boolean z3, String str, boolean z4, int i) {
        this.a = z;
        this.b = z2;
        this.c = l;
        this.d = z3;
        this.e = str;
        this.f = z4;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1b1)) {
            return false;
        }
        q1b1 q1b1Var = (q1b1) obj;
        return this.a == q1b1Var.a && this.b == q1b1Var.b && u890.j(this.c, q1b1Var.c) && this.d == q1b1Var.d && this.e.equals(q1b1Var.e) && this.f == q1b1Var.f && this.g == q1b1Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        int iG2 = xcg1.g(cy30.d(xcg1.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        int i = this.g;
        return iG2 + (i != 0 ? l1d.C(i) : 0);
    }

    public final String toString() {
        String str;
        String lowerCase = "-";
        Object obj = this.c;
        if (obj == null) {
            obj = "-";
        }
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                str = "ACTIVE";
            } else if (i == 2) {
                str = "BEFORE_START";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "AFTER_END";
            }
            lowerCase = str.toLowerCase(Locale.ROOT);
        }
        return "diag:enabled=" + this.a + ";loaded=" + this.b + ";ageSec=" + obj + ";inFlight=" + this.d + ";lastFetch=" + this.e + ";matched=" + this.f + ";window=" + lowerCase;
    }
}
