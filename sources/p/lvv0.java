package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lvv0 {
    public final String a;
    public final String b;
    public final svv0 c;
    public final djw0 d;
    public final boolean e;
    public final boolean f;

    public lvv0(String str, String str2, svv0 svv0Var, djw0 djw0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = svv0Var;
        this.d = djw0Var;
        this.e = z;
        this.f = z2;
    }

    public static lvv0 a(lvv0 lvv0Var, String str, svv0 svv0Var, boolean z, int i) {
        String str2 = lvv0Var.a;
        if ((i & 2) != 0) {
            str = lvv0Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            svv0Var = lvv0Var.c;
        }
        svv0 svv0Var2 = svv0Var;
        djw0 djw0Var = (i & 8) != 0 ? lvv0Var.d : null;
        if ((i & 16) != 0) {
            z = lvv0Var.e;
        }
        boolean z2 = lvv0Var.f;
        lvv0Var.getClass();
        return new lvv0(str2, str3, svv0Var2, djw0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvv0)) {
            return false;
        }
        lvv0 lvv0Var = (lvv0) obj;
        return u890.j(this.a, lvv0Var.a) && u890.j(this.b, lvv0Var.b) && u890.j(this.c, lvv0Var.c) && u890.j(this.d, lvv0Var.d) && this.e == lvv0Var.e && this.f == lvv0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        djw0 djw0Var = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iHashCode2 + (djw0Var != null ? djw0Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public /* synthetic */ lvv0(String str, svv0 svv0Var, djw0 djw0Var, boolean z, int i) {
        this(str, null, svv0Var, (i & 8) != 0 ? null : djw0Var, true, z);
    }
}
