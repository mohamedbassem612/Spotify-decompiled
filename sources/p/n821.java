package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n821 {
    public final String a;
    public final String b;

    public n821(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n821)) {
            return false;
        }
        n821 n821Var = (n821) obj;
        return this.a.equals(n821Var.a) && u890.j(this.b, n821Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
