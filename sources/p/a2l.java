package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2l implements c2l {
    public final kpy0 a;

    public a2l(kpy0 kpy0Var) {
        this.a = kpy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2l) && this.a == ((a2l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
