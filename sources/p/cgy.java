package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cgy {
    public final y6l1 a;
    public final String b;

    public cgy(String str, y6l1 y6l1Var) {
        this.a = y6l1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgy)) {
            return false;
        }
        cgy cgyVar = (cgy) obj;
        return this.a.equals(cgyVar.a) && this.b.equals(cgyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
