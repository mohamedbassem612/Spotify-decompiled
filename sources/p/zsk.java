package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zsk {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final dxr0 e;
    public final tpw0 f;

    public zsk(boolean z, boolean z2, String str, String str2, dxr0 dxr0Var, tpw0 tpw0Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = dxr0Var;
        this.f = tpw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsk)) {
            return false;
        }
        zsk zskVar = (zsk) obj;
        return this.a == zskVar.a && this.b == zskVar.b && u890.j(this.c, zskVar.c) && u890.j(this.d, zskVar.d) && this.e.equals(zskVar.e) && this.f == zskVar.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
