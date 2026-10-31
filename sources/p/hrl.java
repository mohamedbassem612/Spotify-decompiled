package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrl implements ez00 {
    public final h290 a;

    public hrl(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrl) && this.a.equals(((hrl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
