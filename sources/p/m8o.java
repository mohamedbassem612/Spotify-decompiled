package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m8o extends buo1 {
    public final nl3 b;

    public m8o(era eraVar) {
        this.b = eraVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8o) && u890.j(this.b, ((m8o) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final int r(int i, int i2, flb0 flb0Var, q5t0 q5t0Var, int i3) {
        return this.b.a(i2, i, flb0Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.b + ")";
    }
}
