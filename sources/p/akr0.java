package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class akr0 {
    public final dt71 a;
    public final dt71 b;
    public final dt71 c;

    public akr0(dt71 dt71Var, dt71 dt71Var2, dt71 dt71Var3) {
        this.a = dt71Var;
        this.b = dt71Var2;
        this.c = dt71Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akr0)) {
            return false;
        }
        akr0 akr0Var = (akr0) obj;
        return this.a == akr0Var.a && this.b == akr0Var.b && this.c == akr0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
