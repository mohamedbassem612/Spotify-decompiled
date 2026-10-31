package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b6k1 {
    public final String a;
    public final lsm0 b;

    public b6k1(String str, lsm0 lsm0Var) {
        this.a = str;
        this.b = lsm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6k1)) {
            return false;
        }
        b6k1 b6k1Var = (b6k1) obj;
        return u890.j(this.a, b6k1Var.a) && this.b.equals(b6k1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
