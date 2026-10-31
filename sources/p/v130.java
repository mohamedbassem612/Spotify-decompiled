package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v130 {
    public final String a;
    public final String b;
    public final u130 c;

    public v130(String str, String str2, u130 u130Var) {
        this.a = str;
        this.b = str2;
        this.c = u130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v130)) {
            return false;
        }
        v130 v130Var = (v130) obj;
        return this.a.equals(v130Var.a) && u890.j(this.b, v130Var.b) && this.c.equals(v130Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
