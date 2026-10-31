package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fy6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final PlayabilityRestriction g;
    public final String h;
    public final String i;
    public final o1v j;

    public fy6(String str, String str2, String str3, boolean z, boolean z2, boolean z3, PlayabilityRestriction playabilityRestriction, String str4, String str5, o1v o1vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = playabilityRestriction;
        this.h = str4;
        this.i = str5;
        this.j = o1vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy6)) {
            return false;
        }
        fy6 fy6Var = (fy6) obj;
        return u890.j(this.a, fy6Var.a) && u890.j(this.b, fy6Var.b) && this.c.equals(fy6Var.c) && this.d == fy6Var.d && this.e == fy6Var.e && this.f == fy6Var.f && this.g == fy6Var.g && this.h.equals(fy6Var.h) && u890.j(this.i, fy6Var.i) && this.j == fy6Var.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + cy30.d(cy30.d((this.g.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i);
    }
}
