package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qdm {
    public final kjm a;
    public final yim b;

    public qdm(kjm kjmVar, yim yimVar) {
        this.a = kjmVar;
        this.b = yimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdm)) {
            return false;
        }
        qdm qdmVar = (qdm) obj;
        return u890.j(this.a, qdmVar.a) && u890.j(this.b, qdmVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yim yimVar = this.b;
        return iHashCode + (yimVar == null ? 0 : yimVar.hashCode());
    }
}
