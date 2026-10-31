package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tsn0 {
    public final btn0 a;

    public tsn0(btn0 btn0Var) {
        this.a = btn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsn0) && this.a.equals(((tsn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
