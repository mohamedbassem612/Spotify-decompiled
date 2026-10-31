package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a7d1 {
    public final String a;
    public final int b;

    public a7d1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7d1)) {
            return false;
        }
        a7d1 a7d1Var = (a7d1) obj;
        return this.a.equals(a7d1Var.a) && this.b == a7d1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
