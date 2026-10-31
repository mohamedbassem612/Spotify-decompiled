package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jxf0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public jxf0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxf0)) {
            return false;
        }
        jxf0 jxf0Var = (jxf0) obj;
        return u890.j(this.a, jxf0Var.a) && this.b == jxf0Var.b && this.c == jxf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
