package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u04 {
    public final x04 a;

    public u04(x04 x04Var) {
        this.a = x04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u04) && this.a.equals(((u04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
