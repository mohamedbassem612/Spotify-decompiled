package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d7c0 {
    public final b7c0 a;

    public d7c0(b7c0 b7c0Var) {
        this.a = b7c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7c0) && this.a == ((d7c0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
