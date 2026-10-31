package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j56 {
    public final String a;
    public final dzk b;

    public j56(String str, dzk dzkVar) {
        this.a = str;
        this.b = dzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j56)) {
            return false;
        }
        j56 j56Var = (j56) obj;
        return u890.j(this.a, j56Var.a) && u890.j(this.b, j56Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dzk dzkVar = this.b;
        return iHashCode + (dzkVar == null ? 0 : dzkVar.a.hashCode());
    }
}
