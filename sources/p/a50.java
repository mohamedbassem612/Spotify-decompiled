package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a50 implements b50 {
    public final String a;
    public final String b;

    public a50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return this.a.equals(a50Var.a) && this.b.equals(a50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
