package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oh9 implements rh9 {
    public final jh9 a;

    public oh9(jh9 jh9Var) {
        this.a = jh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh9) && u890.j(this.a, ((oh9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
