package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class znt0 {
    public final String a;
    public final String b;
    public final h1p1 c;
    public final boolean d;

    public znt0(String str, String str2, h1p1 h1p1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = h1p1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znt0)) {
            return false;
        }
        znt0 znt0Var = (znt0) obj;
        return u890.j(this.a, znt0Var.a) && u890.j(this.b, znt0Var.b) && u890.j(this.c, znt0Var.c) && this.d == znt0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public /* synthetic */ znt0(String str, ynt0 ynt0Var) {
        this(str, null, ynt0Var, false);
    }
}
