package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z8u extends d9u {
    public final r160 a;

    public z8u(r160 r160Var) {
        this.a = r160Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8u) && u890.j(this.a, ((z8u) obj).a);
    }

    public final int hashCode() {
        r160 r160Var = this.a;
        if (r160Var == null) {
            return 0;
        }
        return r160Var.hashCode();
    }
}
