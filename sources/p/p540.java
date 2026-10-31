package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p540 {
    public final s540 a;

    public p540(s540 s540Var) {
        this.a = s540Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p540) && u890.j(this.a, ((p540) obj).a);
    }

    public final int hashCode() {
        s540 s540Var = this.a;
        if (s540Var == null) {
            return 0;
        }
        return s540Var.hashCode();
    }
}
