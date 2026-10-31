package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qh9 implements rh9 {
    public final jh9 a;

    public qh9(jh9 jh9Var) {
        this.a = jh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh9) && u890.j(this.a, ((qh9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
