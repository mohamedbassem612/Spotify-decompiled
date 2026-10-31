package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g5l implements i5l {
    public final kx7 a;

    public g5l(kx7 kx7Var) {
        this.a = kx7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5l) && u890.j(this.a, ((g5l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
