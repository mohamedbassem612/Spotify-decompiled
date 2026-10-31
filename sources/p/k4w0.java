package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k4w0 {
    public final String a;
    public final String b;

    public k4w0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4w0)) {
            return false;
        }
        k4w0 k4w0Var = (k4w0) obj;
        return u890.j(this.a, k4w0Var.a) && u890.j(this.b, k4w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
