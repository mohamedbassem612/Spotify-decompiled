package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b140 {
    public final a140 a;
    public final klz0 b;
    public final aka1 c;

    public b140(a140 a140Var, klz0 klz0Var, aka1 aka1Var) {
        this.a = a140Var;
        this.b = klz0Var;
        this.c = aka1Var;
    }

    public final a140 a() {
        return this.a;
    }

    public final aka1 b() {
        return this.c;
    }

    public final klz0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b140)) {
            return false;
        }
        b140 b140Var = (b140) obj;
        return this.a.equals(b140Var.a) && this.b.equals(b140Var.b) && u890.j(this.c, b140Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
