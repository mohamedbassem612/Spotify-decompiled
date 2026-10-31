package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class km10 {
    public final boolean a;
    public final td b;

    public km10(boolean z, td tdVar) {
        this.a = z;
        this.b = tdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km10)) {
            return false;
        }
        km10 km10Var = (km10) obj;
        return this.a == km10Var.a && u890.j(this.b, km10Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        td tdVar = this.b;
        return iHashCode + (tdVar == null ? 0 : tdVar.hashCode());
    }
}
