package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xl90 implements am90 {
    public final cm90 a;

    public xl90(cm90 cm90Var) {
        this.a = cm90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl90) && this.a.equals(((xl90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
