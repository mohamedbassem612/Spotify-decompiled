package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i2m implements r2m {
    public final k620 a;

    public i2m(k620 k620Var) {
        this.a = k620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2m) && this.a == ((i2m) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
