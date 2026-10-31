package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v3a0 implements z3a0 {
    public final String a;
    public final String b;

    public v3a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3a0)) {
            return false;
        }
        v3a0 v3a0Var = (v3a0) obj;
        return u890.j(this.a, v3a0Var.a) && u890.j(this.b, v3a0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
