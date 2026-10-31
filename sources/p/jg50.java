package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jg50 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public jg50(int i, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg50)) {
            return false;
        }
        jg50 jg50Var = (jg50) obj;
        return this.a.equals(jg50Var.a) && this.b.equals(jg50Var.b) && this.c == jg50Var.c && this.d == jg50Var.d && this.e == jg50Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
