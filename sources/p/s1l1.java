package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s1l1 extends j2l1 {
    public final String a;
    public final boolean b;

    public s1l1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1l1)) {
            return false;
        }
        s1l1 s1l1Var = (s1l1) obj;
        return this.a.equals(s1l1Var.a) && this.b == s1l1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
