package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n23 {
    public final String a;
    public final String b;

    public n23(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n23)) {
            return false;
        }
        n23 n23Var = (n23) obj;
        return u890.j(this.a, n23Var.a) && u890.j(this.b, n23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
