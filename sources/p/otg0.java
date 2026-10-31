package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class otg0 {
    public final mtg0 a;
    public final long b;
    public final long c;

    public otg0(mtg0 mtg0Var, long j, long j2) {
        this.a = mtg0Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otg0)) {
            return false;
        }
        otg0 otg0Var = (otg0) obj;
        return this.a.equals(otg0Var.a) && this.b == otg0Var.b && this.c == otg0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
