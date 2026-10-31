package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lm6 implements nm6 {
    public final c9 a;
    public final String b;

    public lm6(String str, c9 c9Var) {
        this.a = c9Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm6)) {
            return false;
        }
        lm6 lm6Var = (lm6) obj;
        return u890.j(this.a, lm6Var.a) && u890.j(this.b, lm6Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
