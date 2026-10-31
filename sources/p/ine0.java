package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ine0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ine0(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ine0)) {
            return false;
        }
        ine0 ine0Var = (ine0) obj;
        return u890.j(this.a, ine0Var.a) && u890.j(this.b, ine0Var.b) && this.c == ine0Var.c && this.d == ine0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + kaa0.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
