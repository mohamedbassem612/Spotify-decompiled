package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pu50 implements z0i {
    public final c380 a;

    public pu50(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu50) && u890.j(this.a, ((pu50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
