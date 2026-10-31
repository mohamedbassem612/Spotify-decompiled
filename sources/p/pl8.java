package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pl8 {
    public final String a;
    public final boolean b;
    public final bk8 c;

    public pl8(String str, boolean z, bk8 bk8Var) {
        this.a = str;
        this.b = z;
        this.c = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl8)) {
            return false;
        }
        pl8 pl8Var = (pl8) obj;
        return this.a.equals(pl8Var.a) && this.b == pl8Var.b && this.c == pl8Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
