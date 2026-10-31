package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tz31 {
    public final wz31 a;
    public final n041 b;

    public tz31(wz31 wz31Var, n041 n041Var) {
        this.a = wz31Var;
        this.b = n041Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz31)) {
            return false;
        }
        tz31 tz31Var = (tz31) obj;
        return u890.j(this.a, tz31Var.a) && this.b.equals(tz31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
