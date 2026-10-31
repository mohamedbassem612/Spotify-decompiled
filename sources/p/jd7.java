package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jd7 extends ld7 {
    public final String a;
    public final r620 b;

    public jd7(String str, r620 r620Var) {
        this.a = str;
        this.b = r620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd7)) {
            return false;
        }
        jd7 jd7Var = (jd7) obj;
        return u890.j(this.a, jd7Var.a) && this.b == jd7Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        r620 r620Var = this.b;
        return iHashCode + (r620Var != null ? r620Var.hashCode() : 0);
    }
}
