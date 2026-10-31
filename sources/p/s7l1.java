package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s7l1 {
    public final ljj1 a;
    public final String b;
    public final boolean c;

    public s7l1(ljj1 ljj1Var, String str, boolean z) {
        this.a = ljj1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7l1)) {
            return false;
        }
        s7l1 s7l1Var = (s7l1) obj;
        return u890.j(this.a, s7l1Var.a) && u890.j(this.b, s7l1Var.b) && this.c == s7l1Var.c;
    }

    public final int hashCode() {
        ljj1 ljj1Var = this.a;
        return Boolean.hashCode(this.c) + cy30.d((ljj1Var == null ? 0 : ljj1Var.hashCode()) * 31, 31, this.b);
    }
}
