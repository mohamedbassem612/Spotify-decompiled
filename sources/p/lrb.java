package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lrb implements nrb {
    public final Boolean a;
    public final drb b;

    public lrb(Boolean bool, drb drbVar) {
        this.a = bool;
        this.b = drbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrb)) {
            return false;
        }
        lrb lrbVar = (lrb) obj;
        return u890.j(this.a, lrbVar.a) && this.b.equals(lrbVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }
}
