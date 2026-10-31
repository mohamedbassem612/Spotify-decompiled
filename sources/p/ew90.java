package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ew90 implements fw90 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public ew90(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str4;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew90)) {
            return false;
        }
        ew90 ew90Var = (ew90) obj;
        return u890.j(this.a, ew90Var.a) && u890.j(this.b, ew90Var.b) && u890.j(this.c, ew90Var.c) && this.d == ew90Var.d && this.e == ew90Var.e && this.f == ew90Var.f && this.g.equals(ew90Var.g) && this.h == ew90Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.h) + cy30.d(xcg1.g(xcg1.g(xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
