package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kka1 {
    public final c380 a;
    public final String b;

    public kka1(String str, c380 c380Var) {
        this.a = c380Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kka1)) {
            return false;
        }
        kka1 kka1Var = (kka1) obj;
        return u890.j(this.a, kka1Var.a) && u890.j(this.b, kka1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
