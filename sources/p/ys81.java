package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ys81 implements kt81 {
    public final e090 a;

    public ys81(e090 e090Var) {
        this.a = e090Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys81) && u890.j(this.a, ((ys81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
