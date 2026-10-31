package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lrl implements nrl {
    public final orl a;

    public lrl(orl orlVar) {
        this.a = orlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrl) && u890.j(this.a, ((lrl) obj).a);
    }

    public final int hashCode() {
        orl orlVar = this.a;
        if (orlVar == null) {
            return 0;
        }
        return orlVar.hashCode();
    }
}
