package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f6s0 extends j6s0 {
    public final String a;
    public final boolean b;

    public f6s0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6s0)) {
            return false;
        }
        f6s0 f6s0Var = (f6s0) obj;
        return u890.j(this.a, f6s0Var.a) && this.b == f6s0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PasswordInputChanged()";
    }
}
