package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rk70 {
    public final int a;
    public final pk70 b;

    public rk70(int i) {
        this(i, new pk70());
    }

    public final pk70 a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk70)) {
            return false;
        }
        rk70 rk70Var = (rk70) obj;
        return this.a == rk70Var.a && u890.j(this.b, rk70Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        pk70 pk70Var = this.b;
        return Boolean.hashCode(false) + ((iHashCode + (pk70Var == null ? 0 : pk70Var.hashCode())) * 31);
    }

    public rk70(int i, pk70 pk70Var) {
        this.a = i;
        this.b = pk70Var;
    }
}
