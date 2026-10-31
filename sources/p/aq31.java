package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aq31 {
    public final String a;
    public final long b;

    public aq31(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq31)) {
            return false;
        }
        aq31 aq31Var = (aq31) obj;
        return u890.j(this.a, aq31Var.a) && this.b == aq31Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
