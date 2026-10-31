package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a9h1 {
    public final String a;
    public final int b;

    public a9h1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9h1)) {
            return false;
        }
        a9h1 a9h1Var = (a9h1) obj;
        return u890.j(this.a, a9h1Var.a) && this.b == a9h1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
