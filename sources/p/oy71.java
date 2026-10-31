package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oy71 implements l771, mtd {
    public final String a;
    public final o571 b;
    public final q6q0 c;
    public final p371 d;
    public final int e;

    public oy71(String str, o571 o571Var, q6q0 q6q0Var, p371 p371Var, int i) {
        this.a = str;
        this.b = o571Var;
        this.c = q6q0Var;
        this.d = p371Var;
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy71)) {
            return false;
        }
        oy71 oy71Var = (oy71) obj;
        return u890.j(this.a, oy71Var.a) && u890.j(this.b, oy71Var.b) && u890.j(this.c, oy71Var.c) && u890.j(this.d, oy71Var.d) && this.e == oy71Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        q6q0 q6q0Var = this.c;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (q6q0Var == null ? 0 : q6q0Var.hashCode())) * 31)) * 31);
    }
}
