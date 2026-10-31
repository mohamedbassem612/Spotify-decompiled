package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zx41 implements by41 {
    public final h951 a;
    public final String b;

    public zx41(h951 h951Var, String str) {
        this.a = h951Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx41)) {
            return false;
        }
        zx41 zx41Var = (zx41) obj;
        return this.a.equals(zx41Var.a) && this.b.equals(zx41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
