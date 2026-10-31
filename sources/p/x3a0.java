package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x3a0 implements z3a0 {
    public final String a;
    public final ee9 b;
    public final String c;

    public x3a0(String str, ee9 ee9Var, String str2) {
        this.a = str;
        this.b = ee9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3a0)) {
            return false;
        }
        x3a0 x3a0Var = (x3a0) obj;
        return u890.j(this.a, x3a0Var.a) && this.b.equals(x3a0Var.b) && u890.j(this.c, x3a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
