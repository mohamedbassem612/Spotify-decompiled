package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jjc0 {
    public final String a;
    public final String b;
    public final int c;

    public jjc0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjc0)) {
            return false;
        }
        jjc0 jjc0Var = (jjc0) obj;
        return u890.j(this.a, jjc0Var.a) && u890.j(this.b, jjc0Var.b) && this.c == jjc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
