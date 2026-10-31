package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ox80 {
    public final String a;
    public final tv80 b;
    public final boolean c;

    public ox80(String str, tv80 tv80Var, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        tv80Var = (i & 2) != 0 ? null : tv80Var;
        z = (i & 4) != 0 ? false : z;
        this.a = str;
        this.b = tv80Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox80)) {
            return false;
        }
        ox80 ox80Var = (ox80) obj;
        return u890.j(this.a, ox80Var.a) && u890.j(this.b, ox80Var.b) && this.c == ox80Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tv80 tv80Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0)) * 31);
    }
}
