package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jf9 implements pf9 {
    public final String a;
    public final int b;
    public final int c;

    public jf9(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf9)) {
            return false;
        }
        jf9 jf9Var = (jf9) obj;
        return this.a.equals(jf9Var.a) && this.b == jf9Var.b && this.c == jf9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
