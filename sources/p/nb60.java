package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nb60 {
    public final mb60 a;
    public final String b;

    public nb60(mb60 mb60Var, String str) {
        this.a = mb60Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb60)) {
            return false;
        }
        nb60 nb60Var = (nb60) obj;
        return this.a.equals(nb60Var.a) && u890.j(this.b, nb60Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
