package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ccz {
    public final String a;
    public final jo70 b;
    public final hll c;
    public final String d;
    public final wkk1 e;
    public final boolean f;
    public final boolean g;

    public ccz(String str, jo70 jo70Var, hll hllVar, String str2, wkk1 wkk1Var, boolean z, boolean z2) {
        this.a = str;
        this.b = jo70Var;
        this.c = hllVar;
        this.d = str2;
        this.e = wkk1Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccz)) {
            return false;
        }
        ccz cczVar = (ccz) obj;
        return u890.j(this.a, cczVar.a) && u890.j(this.b, cczVar.b) && u890.j(this.c, cczVar.c) && u890.j(this.d, cczVar.d) && u890.j(this.e, cczVar.e) && this.f == cczVar.f && this.g == cczVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
    }
}
