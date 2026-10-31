package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yg21 extends lh21 {
    public final t7q0 a;

    public yg21(t7q0 t7q0Var) {
        this.a = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg21) && this.a.equals(((yg21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
