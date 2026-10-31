package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jka1 {
    public final String a;
    public final int b;

    public jka1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jka1)) {
            return false;
        }
        jka1 jka1Var = (jka1) obj;
        return this.a.equals(jka1Var.a) && this.b == jka1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
