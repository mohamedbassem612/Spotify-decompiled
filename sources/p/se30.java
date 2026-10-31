package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class se30 {
    public final String a;
    public final String b;

    public se30(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se30)) {
            return false;
        }
        se30 se30Var = (se30) obj;
        return u890.j(this.a, se30Var.a) && u890.j(this.b, se30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
