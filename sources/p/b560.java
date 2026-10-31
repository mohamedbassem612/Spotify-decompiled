package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b560 implements c560 {
    public final l560 a;
    public final me20 b;

    public b560(l560 l560Var, me20 me20Var) {
        this.a = l560Var;
        this.b = me20Var;
    }

    @Override // p.c560
    public final m560 a() {
        return this.a;
    }

    @Override // p.c560
    public final me20 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b560)) {
            return false;
        }
        b560 b560Var = (b560) obj;
        return this.a.equals(b560Var.a) && this.b.equals(b560Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
