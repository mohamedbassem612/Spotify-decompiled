package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g78 {
    public final String a;
    public final ka b;

    public g78(String str, ka kaVar) {
        this.a = str;
        this.b = kaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g78) {
            g78 g78Var = (g78) obj;
            return this.a.equals(g78Var.a) && this.b == g78Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
