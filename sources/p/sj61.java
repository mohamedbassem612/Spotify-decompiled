package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sj61 extends oqo1 {
    public final uj61 d;

    public sj61(uj61 uj61Var) {
        this.d = uj61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj61) && this.d.equals(((sj61) obj).d);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
