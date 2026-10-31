package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zi6 implements bj6 {
    public final xi6 a;

    public zi6(xi6 xi6Var) {
        this.a = xi6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi6) && this.a.equals(((zi6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
