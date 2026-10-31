package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e8a0 {
    public static final e8a0 d = new e8a0(kl21.c, 6);
    public final kl21 a;
    public final h8b0 b;
    public final kl21 c;

    public e8a0(kl21 kl21Var, int i) {
        this(kl21Var, (i & 2) != 0 ? new h8b0(1, 0, 0) : null, kl21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8a0)) {
            return false;
        }
        e8a0 e8a0Var = (e8a0) obj;
        return this.a == e8a0Var.a && u890.j(this.b, e8a0Var.b) && this.c == e8a0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        h8b0 h8b0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (h8b0Var == null ? 0 : h8b0Var.d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public e8a0(kl21 kl21Var, h8b0 h8b0Var, kl21 kl21Var2) {
        this.a = kl21Var;
        this.b = h8b0Var;
        this.c = kl21Var2;
    }
}
