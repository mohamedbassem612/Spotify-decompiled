package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class av61 {
    public final wu61 a;
    public final wu61 b;
    public final c380 c;

    public av61(wu61 wu61Var, wu61 wu61Var2, c380 c380Var) {
        this.a = wu61Var;
        this.b = wu61Var2;
        this.c = c380Var;
    }

    public final wu61 a() {
        return this.b;
    }

    public final c380 b() {
        return this.c;
    }

    public final wu61 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av61)) {
            return false;
        }
        av61 av61Var = (av61) obj;
        return u890.j(this.a, av61Var.a) && u890.j(this.b, av61Var.b) && u890.j(this.c, av61Var.c);
    }

    public final int hashCode() {
        wu61 wu61Var = this.a;
        int iHashCode = wu61Var == null ? 0 : wu61Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
