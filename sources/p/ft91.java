package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ft91 {
    public final er91 a;
    public final lr91 b;

    public ft91(er91 er91Var, lr91 lr91Var) {
        this.a = er91Var;
        this.b = lr91Var;
    }

    public final lr91 a() {
        return this.b;
    }

    public final er91 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft91)) {
            return false;
        }
        ft91 ft91Var = (ft91) obj;
        return u890.j(this.a, ft91Var.a) && this.b.equals(ft91Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
