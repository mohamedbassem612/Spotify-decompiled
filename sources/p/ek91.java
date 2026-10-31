package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ek91 extends yk91 {
    public final ll91 a;
    public final long b;

    public ek91(ll91 ll91Var, long j) {
        this.a = ll91Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek91)) {
            return false;
        }
        ek91 ek91Var = (ek91) obj;
        return this.a.equals(ek91Var.a) && this.b == ek91Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
