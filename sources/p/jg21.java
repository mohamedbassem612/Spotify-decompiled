package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jg21 {
    public final String a;
    public final String b;

    public jg21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg21)) {
            return false;
        }
        jg21 jg21Var = (jg21) obj;
        return u890.j(this.a, jg21Var.a) && u890.j(this.b, jg21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
