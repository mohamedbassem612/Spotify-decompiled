package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k6c1 {
    public final String a;
    public final dzo1 b;

    public k6c1(String str, dzo1 dzo1Var) {
        this.a = str;
        this.b = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6c1)) {
            return false;
        }
        k6c1 k6c1Var = (k6c1) obj;
        return u890.j(this.a, k6c1Var.a) && this.b.equals(k6c1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
