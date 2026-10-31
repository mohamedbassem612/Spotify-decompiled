package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b5g0 extends t4n1 {
    public final String b;
    public final String c;
    public final g4a d;

    public b5g0(String str, String str2, g4a g4aVar) {
        this.b = str;
        this.c = str2;
        this.d = g4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5g0)) {
            return false;
        }
        b5g0 b5g0Var = (b5g0) obj;
        return u890.j(this.b, b5g0Var.b) && this.c.equals(b5g0Var.c) && this.d == b5g0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(this.b.hashCode() * 31, 31, this.c);
    }
}
