package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d4j1 {
    public final uqo a;
    public final String b;

    public d4j1(uqo uqoVar, String str) {
        this.a = uqoVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4j1)) {
            return false;
        }
        d4j1 d4j1Var = (d4j1) obj;
        return this.a.equals(d4j1Var.a) && this.b.equals(d4j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
