package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qvz implements o700 {
    public final h290 a;

    public qvz(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvz) && this.a.equals(((qvz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
