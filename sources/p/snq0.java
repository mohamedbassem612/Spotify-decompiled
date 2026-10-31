package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class snq0 extends hoq0 {
    public final c560 a;
    public final String b;

    public snq0(c560 c560Var, String str) {
        this.a = c560Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snq0)) {
            return false;
        }
        snq0 snq0Var = (snq0) obj;
        return this.a.equals(snq0Var.a) && this.b.equals(snq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
