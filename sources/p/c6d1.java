package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c6d1 {
    public final e6d1 a;
    public final f6d1 b;
    public final b6d1 c;

    public c6d1(e6d1 e6d1Var, f6d1 f6d1Var, b6d1 b6d1Var) {
        this.a = e6d1Var;
        this.b = f6d1Var;
        this.c = b6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6d1)) {
            return false;
        }
        c6d1 c6d1Var = (c6d1) obj;
        return this.a == c6d1Var.a && this.b == c6d1Var.b && u890.j(this.c, c6d1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
