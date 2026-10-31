package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ot80 {
    public final c380 a;

    public ot80(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot80) && u890.j(this.a, ((ot80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
