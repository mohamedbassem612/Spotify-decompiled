package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v6a1 {
    public final u6a1 a;
    public final String b;
    public final c9 c;

    public v6a1(u6a1 u6a1Var, String str, c9 c9Var) {
        this.a = u6a1Var;
        this.b = str;
        this.c = c9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6a1)) {
            return false;
        }
        v6a1 v6a1Var = (v6a1) obj;
        return this.a.equals(v6a1Var.a) && u890.j(this.b, v6a1Var.b) && u890.j(this.c, v6a1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
