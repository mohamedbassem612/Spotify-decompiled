package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g2q0 {
    public final String a;
    public final String b;

    public g2q0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2q0)) {
            return false;
        }
        g2q0 g2q0Var = (g2q0) obj;
        return this.a.equals(g2q0Var.a) && this.b.equals(g2q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
