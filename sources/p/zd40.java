package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zd40 {
    public final boolean a;
    public final String b;
    public final h4d0 c;
    public final boolean d;

    public zd40(boolean z, String str, h4d0 h4d0Var, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = h4d0Var;
        this.d = z2;
    }

    public static zd40 a(zd40 zd40Var, boolean z, String str, h4d0 h4d0Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = zd40Var.a;
        }
        if ((i & 2) != 0) {
            str = zd40Var.b;
        }
        if ((i & 4) != 0) {
            h4d0Var = zd40Var.c;
        }
        if ((i & 8) != 0) {
            z2 = zd40Var.d;
        }
        return new zd40(z, str, h4d0Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd40)) {
            return false;
        }
        zd40 zd40Var = (zd40) obj;
        return this.a == zd40Var.a && u890.j(this.b, zd40Var.b) && this.c == zd40Var.c && this.d == zd40Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
