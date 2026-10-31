package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p351 {
    public final String a;
    public final String b;

    public p351(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p351)) {
            return false;
        }
        p351 p351Var = (p351) obj;
        return this.a.equals(p351Var.a) && this.b.equals(p351Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
