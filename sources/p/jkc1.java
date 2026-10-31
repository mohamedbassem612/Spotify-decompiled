package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jkc1 implements z0i {
    public final String a;
    public final ikc1 b;

    public jkc1(String str, ikc1 ikc1Var) {
        this.a = str;
        this.b = ikc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkc1)) {
            return false;
        }
        jkc1 jkc1Var = (jkc1) obj;
        return this.a.equals(jkc1Var.a) && this.b.equals(jkc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
