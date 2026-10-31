package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j450 implements m450 {
    public final r250 a;

    public j450(r250 r250Var) {
        this.a = r250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j450) && this.a == ((j450) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
