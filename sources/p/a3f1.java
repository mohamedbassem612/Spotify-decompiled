package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a3f1 {
    public final String a;
    public final String b;

    public a3f1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3f1)) {
            return false;
        }
        a3f1 a3f1Var = (a3f1) obj;
        return u890.j(this.a, a3f1Var.a) && u890.j(this.b, a3f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
