package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bp6 {
    public final String a;
    public final boolean b;

    public bp6(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp6)) {
            return false;
        }
        bp6 bp6Var = (bp6) obj;
        return u890.j(this.a, bp6Var.a) && this.b == bp6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
