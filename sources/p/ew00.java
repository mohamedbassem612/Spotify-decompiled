package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ew00 implements ww00 {
    public final jx00 a;

    public ew00(jx00 jx00Var) {
        this.a = jx00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ew00) && this.a == ((ew00) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
