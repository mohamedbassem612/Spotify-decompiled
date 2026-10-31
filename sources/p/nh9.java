package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nh9 implements rh9 {
    public final jh9 a;

    public nh9(jh9 jh9Var) {
        this.a = jh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh9) && this.a.equals(((nh9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
