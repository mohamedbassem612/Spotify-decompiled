package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ld1 {
    public final String a;
    public final iyr0 b;

    public ld1(String str, iyr0 iyr0Var) {
        this.a = str;
        this.b = iyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld1)) {
            return false;
        }
        ld1 ld1Var = (ld1) obj;
        return u890.j(this.a, ld1Var.a) && this.b == ld1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
