package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4g1 {
    public final String a;
    public final String b;
    public final String c = "podcast-trailer";
    public final boolean d;

    public w4g1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4g1)) {
            return false;
        }
        w4g1 w4g1Var = (w4g1) obj;
        return this.a.equals(w4g1Var.a) && this.b.equals(w4g1Var.b) && this.c.equals(w4g1Var.c) && this.d == w4g1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(kaa0.f(0, xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, true), 31), 31, false);
    }
}
