package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rcw {
    public final String a;
    public final jqf b;

    public rcw(String str, jqf jqfVar) {
        this.a = str;
        this.b = jqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcw)) {
            return false;
        }
        rcw rcwVar = (rcw) obj;
        return u890.j(this.a, rcwVar.a) && this.b == rcwVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqf jqfVar = this.b;
        return iHashCode + (jqfVar == null ? 0 : jqfVar.hashCode());
    }
}
