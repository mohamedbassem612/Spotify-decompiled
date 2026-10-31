package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jai1 implements kai1 {
    public final l560 a;
    public final z9i1 b;

    public jai1(l560 l560Var, z9i1 z9i1Var) {
        this.a = l560Var;
        this.b = z9i1Var;
    }

    @Override // p.kai1
    public final m560 a() {
        return this.a;
    }

    @Override // p.kai1
    public final z9i1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jai1)) {
            return false;
        }
        jai1 jai1Var = (jai1) obj;
        return this.a.equals(jai1Var.a) && this.b.equals(jai1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
