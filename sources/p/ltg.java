package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ltg {
    public final long a;
    public final stg b;

    public ltg(long j, stg stgVar) {
        this.a = j;
        this.b = stgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltg)) {
            return false;
        }
        ltg ltgVar = (ltg) obj;
        return this.a == ltgVar.a && u890.j(this.b, ltgVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        stg stgVar = this.b;
        return iHashCode + (stgVar == null ? 0 : stgVar.hashCode());
    }
}
