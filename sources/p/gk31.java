package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gk31 {
    public final tjf0 a;
    public final fk31 b;
    public final fk31 c;

    public gk31(tjf0 tjf0Var, fk31 fk31Var, fk31 fk31Var2) {
        this.a = tjf0Var;
        this.b = fk31Var;
        this.c = fk31Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk31)) {
            return false;
        }
        gk31 gk31Var = (gk31) obj;
        return this.a == gk31Var.a && this.b == gk31Var.b && this.c == gk31Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
