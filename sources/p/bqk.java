package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bqk {
    public final j6k a;
    public final lhe0 b;

    public bqk(j6k j6kVar, lhe0 lhe0Var) {
        this.a = j6kVar;
        this.b = lhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqk)) {
            return false;
        }
        bqk bqkVar = (bqk) obj;
        return this.a.equals(bqkVar.a) && this.b.equals(bqkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
