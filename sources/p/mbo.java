package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mbo extends obo {
    public final sbo a;
    public final i2n b;

    public mbo(sbo sboVar, i2n i2nVar) {
        this.a = sboVar;
        this.b = i2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbo)) {
            return false;
        }
        mbo mboVar = (mbo) obj;
        return this.a.equals(mboVar.a) && u890.j(this.b, mboVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        i2n i2nVar = this.b;
        return iHashCode + (i2nVar == null ? 0 : i2nVar.hashCode());
    }
}
