package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nyj0 {
    public final String a;
    public final String b;

    public nyj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyj0)) {
            return false;
        }
        nyj0 nyj0Var = (nyj0) obj;
        return u890.j(this.a, nyj0Var.a) && u890.j(this.b, nyj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
