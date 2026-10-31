package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lu50 implements z0i {
    public final String a;
    public final c380 b;

    public lu50(String str, c9 c9Var) {
        this.a = str;
        this.b = c9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu50)) {
            return false;
        }
        lu50 lu50Var = (lu50) obj;
        return this.a.equals(lu50Var.a) && this.b.equals(lu50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
