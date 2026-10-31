package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t8k1 extends d7p1 {
    public final String c;
    public final tv80 d;
    public final String e;
    public final boolean f;

    public t8k1(String str, String str2, tv80 tv80Var, boolean z) {
        this.c = str;
        this.d = tv80Var;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8k1)) {
            return false;
        }
        t8k1 t8k1Var = (t8k1) obj;
        return u890.j(this.c, t8k1Var.c) && this.d.equals(t8k1Var.d) && u890.j(this.e, t8k1Var.e) && this.f == t8k1Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
