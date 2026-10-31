package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iai1 implements kai1 {
    public final k560 a;
    public final z9i1 b;

    public iai1(k560 k560Var, z9i1 z9i1Var) {
        this.a = k560Var;
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
        if (!(obj instanceof iai1)) {
            return false;
        }
        iai1 iai1Var = (iai1) obj;
        return this.a.equals(iai1Var.a) && this.b.equals(iai1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
