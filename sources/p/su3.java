package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class su3 {
    public final hqq0 a;

    public su3(hqq0 hqq0Var) {
        this.a = hqq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su3) && this.a.equals(((su3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
