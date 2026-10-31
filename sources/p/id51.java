package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class id51 {
    public final z551 a;
    public final z551 b;
    public final od51 c;

    public id51(z551 z551Var, z551 z551Var2, od51 od51Var) {
        this.a = z551Var;
        this.b = z551Var2;
        this.c = od51Var;
    }

    public final z551 a() {
        return this.b;
    }

    public final od51 b() {
        return this.c;
    }

    public final z551 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id51)) {
            return false;
        }
        id51 id51Var = (id51) obj;
        return u890.j(this.a, id51Var.a) && this.b.equals(id51Var.b) && u890.j(this.c, id51Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        od51 od51Var = this.c;
        return iHashCode + (od51Var == null ? 0 : od51Var.hashCode());
    }
}
