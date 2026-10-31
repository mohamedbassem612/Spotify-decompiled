package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jkm0 implements lkm0 {
    public final String a;
    public final int b;

    public jkm0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkm0)) {
            return false;
        }
        jkm0 jkm0Var = (jkm0) obj;
        return u890.j(this.a, jkm0Var.a) && this.b == jkm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
