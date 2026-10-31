package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k1w0 extends h2w0 {
    public final String a;
    public final String b;

    public k1w0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1w0)) {
            return false;
        }
        k1w0 k1w0Var = (k1w0) obj;
        return u890.j(this.a, k1w0Var.a) && u890.j(this.b, k1w0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
