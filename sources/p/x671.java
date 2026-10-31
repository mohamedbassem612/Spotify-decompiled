package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x671 {
    public final s671 a;
    public final kby b;

    public x671(s671 s671Var, kby kbyVar) {
        this.a = s671Var;
        this.b = kbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x671)) {
            return false;
        }
        x671 x671Var = (x671) obj;
        return this.a.equals(x671Var.a) && this.b.equals(x671Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
