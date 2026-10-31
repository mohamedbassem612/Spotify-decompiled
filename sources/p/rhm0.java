package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rhm0 {
    public final String a;
    public final String b;
    public final int c;
    public final e6r d;
    public final boolean e;

    public rhm0(String str, String str2, int i, e6r e6rVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = e6rVar;
        this.e = z;
    }

    public static rhm0 a(rhm0 rhm0Var, e6r e6rVar, boolean z, int i) {
        String str = rhm0Var.a;
        String str2 = rhm0Var.b;
        int i2 = rhm0Var.c;
        if ((i & 8) != 0) {
            e6rVar = rhm0Var.d;
        }
        e6r e6rVar2 = e6rVar;
        if ((i & 16) != 0) {
            z = rhm0Var.e;
        }
        return new rhm0(str, str2, i2, e6rVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhm0)) {
            return false;
        }
        rhm0 rhm0Var = (rhm0) obj;
        return this.a.equals(rhm0Var.a) && this.b.equals(rhm0Var.b) && this.c == rhm0Var.c && u890.j(this.d, rhm0Var.d) && this.e == rhm0Var.e;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        e6r e6rVar = this.d;
        return Boolean.hashCode(this.e) + ((iF + (e6rVar == null ? 0 : e6rVar.hashCode())) * 31);
    }
}
