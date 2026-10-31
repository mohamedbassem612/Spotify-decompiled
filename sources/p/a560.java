package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a560 implements c560 {
    public final k560 a;
    public final me20 b;

    public a560(k560 k560Var, me20 me20Var) {
        this.a = k560Var;
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
        if (!(obj instanceof a560)) {
            return false;
        }
        a560 a560Var = (a560) obj;
        return this.a.equals(a560Var.a) && this.b.equals(a560Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
