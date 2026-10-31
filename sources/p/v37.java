package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v37 {
    public final boolean a;
    public final String b;
    public final vsn c;
    public final boolean d;

    public v37(boolean z, String str, vsn vsnVar, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = vsnVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v37)) {
            return false;
        }
        v37 v37Var = (v37) obj;
        return this.a == v37Var.a && u890.j(this.b, v37Var.b) && u890.j(this.c, v37Var.c) && this.d == v37Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
