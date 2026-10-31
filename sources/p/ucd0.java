package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ucd0 {
    public final String a;
    public final tcd0 b;

    public ucd0(String str, tcd0 tcd0Var) {
        this.a = str;
        this.b = tcd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucd0)) {
            return false;
        }
        ucd0 ucd0Var = (ucd0) obj;
        return u890.j(this.a, ucd0Var.a) && u890.j(this.b, ucd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tcd0 tcd0Var = this.b;
        return iHashCode + (tcd0Var == null ? 0 : tcd0Var.hashCode());
    }
}
