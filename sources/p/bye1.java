package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bye1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public bye1(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bye1)) {
            return false;
        }
        bye1 bye1Var = (bye1) obj;
        return u890.j(this.a, bye1Var.a) && u890.j(this.b, bye1Var.b) && this.c == bye1Var.c && this.d == bye1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
