package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vho {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final tho d;
    public final nho e;
    public final String f;
    public final String g;
    public final boolean h;

    public /* synthetic */ vho(boolean z, String str, boolean z2, tho thoVar, nho nhoVar, String str2, String str3, int i) {
        this((i & 1) != 0 ? false : z, str, z2, thoVar, (i & 16) != 0 ? kho.a : nhoVar, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, true);
    }

    public final boolean a() {
        return this.a;
    }

    public final tho b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vho)) {
            return false;
        }
        vho vhoVar = (vho) obj;
        return this.a == vhoVar.a && u890.j(this.b, vhoVar.b) && this.c == vhoVar.c && u890.j(this.d, vhoVar.d) && u890.j(this.e, vhoVar.e) && u890.j(this.f, vhoVar.f) && u890.j(this.g, vhoVar.g) && this.h == vhoVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + xcg1.g(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public vho(boolean z, String str, boolean z2, tho thoVar, nho nhoVar, String str2, String str3, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = thoVar;
        this.e = nhoVar;
        this.f = str2;
        this.g = str3;
        this.h = z3;
    }
}
