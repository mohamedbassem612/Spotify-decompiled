package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qf00 extends o4o1 {
    public final d3p1 e;

    public qf00(d3p1 d3p1Var) {
        this.e = d3p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf00) && this.e.equals(((qf00) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
