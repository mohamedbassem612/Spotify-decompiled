package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xyc1 {
    public final String a;
    public final dzo1 b;

    public xyc1(String str, dzo1 dzo1Var) {
        this.a = str;
        this.b = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyc1)) {
            return false;
        }
        xyc1 xyc1Var = (xyc1) obj;
        return u890.j(this.a, xyc1Var.a) && this.b.equals(xyc1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
