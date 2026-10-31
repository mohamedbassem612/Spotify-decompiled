package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cp71 {
    public final t7q0 a;

    public cp71(t7q0 t7q0Var) {
        this.a = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp71) && u890.j(this.a, ((cp71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
