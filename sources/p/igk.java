package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class igk {
    public final j6k a;
    public final lhe0 b;

    public igk(j6k j6kVar, lhe0 lhe0Var) {
        this.a = j6kVar;
        this.b = lhe0Var;
    }

    public final j6k a() {
        return this.a;
    }

    public final lhe0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igk)) {
            return false;
        }
        igk igkVar = (igk) obj;
        return this.a.equals(igkVar.a) && this.b.equals(igkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
