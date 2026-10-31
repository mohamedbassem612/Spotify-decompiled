package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lhe0 implements ez00 {
    public final String a;
    public final snt b;
    public final String c;

    public lhe0(String str, snt sntVar, String str2) {
        this.a = str;
        this.b = sntVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhe0)) {
            return false;
        }
        lhe0 lhe0Var = (lhe0) obj;
        return this.a.equals(lhe0Var.a) && this.b.equals(lhe0Var.b) && u890.j(this.c, lhe0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
