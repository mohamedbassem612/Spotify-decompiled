package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jze1 {
    public final String a;
    public final boolean b;

    public jze1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jze1)) {
            return false;
        }
        jze1 jze1Var = (jze1) obj;
        return u890.j(this.a, jze1Var.a) && this.b == jze1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
