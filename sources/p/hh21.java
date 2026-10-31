package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hh21 extends lh21 {
    public final t7q0 a;

    public hh21(t7q0 t7q0Var) {
        this.a = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh21) && u890.j(this.a, ((hh21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
