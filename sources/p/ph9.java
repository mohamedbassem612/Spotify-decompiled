package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ph9 implements rh9 {
    public final pf9 a;

    public ph9(pf9 pf9Var) {
        this.a = pf9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph9) && this.a.equals(((ph9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
