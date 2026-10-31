package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u731 {
    public final String a;
    public final dzo1 b;

    public u731(String str, dzo1 dzo1Var) {
        this.a = str;
        this.b = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u731)) {
            return false;
        }
        u731 u731Var = (u731) obj;
        return u890.j(this.a, u731Var.a) && this.b.equals(u731Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
