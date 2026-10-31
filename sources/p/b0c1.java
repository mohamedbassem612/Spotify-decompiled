package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b0c1 {
    public final String a;
    public final boolean b;
    public final String c;

    public b0c1(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0c1)) {
            return false;
        }
        b0c1 b0c1Var = (b0c1) obj;
        return this.a.equals(b0c1Var.a) && this.b == b0c1Var.b && u890.j(this.c, b0c1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
